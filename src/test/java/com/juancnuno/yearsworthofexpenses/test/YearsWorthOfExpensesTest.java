package com.juancnuno.yearsworthofexpenses.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.juancnuno.yearsworthofexpenses.YearsWorthOfExpenses;

final class YearsWorthOfExpensesTest {

    @Test
    void get() {
        // Act
        var expenses = YearsWorthOfExpenses.get(8_318_590L);

        // Assert
        assertEquals("$99,900.00", expenses);
    }
}
