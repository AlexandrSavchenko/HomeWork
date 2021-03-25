package com.company;

public class Bank {

    private static double commission = 0;

    public static void addCommission(double commission) {
        Bank.commission = Bank.commission + commission;
    }

    public static double getCommission() {
        return Bank.commission;
    }
}
