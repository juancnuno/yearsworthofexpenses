package com.juancnuno.yearsworthofexpenses;

import java.math.BigDecimal;
import java.text.NumberFormat;

public final class YearsWorthOfExpenses {

    private YearsWorthOfExpenses() {
    }

    public static Object get(long averageMonthlySpending) {
        var spending = 12 * averageMonthlySpending;

        // Round up to the nearest 100,000 https://stackoverflow.com/a/18407671/6036446
        spending = (spending + 99_999) / 100_000 * 100_000;

        return NumberFormat.getCurrencyInstance().format(new BigDecimal(spending).movePointLeft(3));
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
