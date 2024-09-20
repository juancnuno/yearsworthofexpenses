package com.juancnuno.yearsworthofexpenses.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.juancnuno.yearsworthofexpenses.YearsWorthOfExpenses;
import com.juancnuno.ynab.SpendingBreakdown;

final class YearsWorthOfExpensesTest {

    @Test
    void get() {
        // Arrange
        var breakdown = Mockito.mock(SpendingBreakdown.class);
        Mockito.when(breakdown.getAverageMonthlySpending()).thenReturn(8_318_590L);

        // Act
        var expenses = YearsWorthOfExpenses.get(breakdown);

        // Assert
        assertEquals("$99,900.00", expenses);
    }
}
