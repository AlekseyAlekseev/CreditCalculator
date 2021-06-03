package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CreditTests {

    private static int monthPay;
    private static int overPay;
    private static final CreditCalculator credit = new CreditCalculator();
    private static final int sum = 1000000;
    private static final int months = 36;
    private static final int rates = 20;

    @BeforeAll
    public static void createTestData() {
        monthPay = credit.getMonthlyPay(sum, months, rates);
        overPay = credit.getOverpayAmount(monthPay, months, sum);
    }

    @Test
    public void getMonthlyPay() {
        final int expected = 37164;
        int result = credit.getMonthlyPay(sum, months, rates);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getOverpayAmount() {
        final int expected = 337904;
        int result = credit.getOverpayAmount(monthPay, months, sum);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getTotalPay() {
        final int expected = 1337904;
        int result = credit.getTotalPay(sum, overPay);
        Assertions.assertEquals(expected, result);
    }
}
