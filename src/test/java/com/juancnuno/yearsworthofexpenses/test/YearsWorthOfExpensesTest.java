package com.juancnuno.yearsworthofexpenses.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.juancnuno.yearsworthofexpenses.YearsWorthOfExpenses;
import com.juancnuno.ynab.SpendingBreakdown;

final class YearsWorthOfExpensesTest {

    @Test
    void get() {
        // Arrange
        var breakdown = new SpendingBreakdown();

        // Act
        var expenses = YearsWorthOfExpenses.get(breakdown);

        // Assert
        assertEquals(0L, expenses);
    }
}
