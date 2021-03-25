package com.company;

public class BankAccount {

    private String name;
    private double count;

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    // 0.5% commission
    public void add(double money) {
        add(money, 0.005);
    }

    public void add(double money, double comissionPart) {
        count = money*(1-comissionPart);
        Bank.addCommission(money*comissionPart);
    }

    // 1% commission
    public void transfer(BankAccount otherPerson, double money){
        try {
            if(this.count < money)  throw new Exception("Account have no money for transfer.");
            this.count = this.count - money;
            double comissionTransfer = 0.01;
            otherPerson.add(money, comissionTransfer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
