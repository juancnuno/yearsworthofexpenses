package com.juancnuno.yearsworthofexpenses;

import com.juancnuno.ynab.SpendingBreakdown;

final class YearsWorthOfExpenses {

    private YearsWorthOfExpenses() {
    }

    private static Object get(SpendingBreakdown breakdown) {
        return breakdown.getAverageMonthlySpending();
    }

    public static void main(String[] args) {
        System.out.println(YearsWorthOfExpenses.get(new SpendingBreakdown()));
    }
}
