package ru.netology;

public class CreditCalculator {

    /**
     * Расчет ежемесячного платежа по кредиту
     * @param sum Сумма кредита
     * @param months Срок погашения в месяцах
     * @param rates Ставка по кредиту
     */
    public int getMonthlyPay(int sum, int months, int rates) {
        // расчет ежемесячного процента
        double rate = (double) rates / 100 / 12;
        // расчет коэффициента аннуитета
        double coefficient = (rate * Math.pow((1  + rate), months) / ( Math.pow((1 + rate), months ) - 1));
        // расчет ежемесячного платежа
        return (int) Math.round(sum * coefficient);
    }

    /**
     * Расчет суммы переплаты по кредиту
     */
    public int getOverpayAmount(int monthPay, int months, int sum) {
        return (monthPay * months) - sum;
    }

    /**
     * Расчет общей суммы выплаты
     */
    public int getTotalPay(int sum, int overPay) {
        return sum + overPay;
    }
}
