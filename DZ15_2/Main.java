package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);

        boss.add(100000);

        boss.transfer(ivan, 10000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);

        System.out.println(boss.getName() + ": " + boss.getCount());
        System.out.println(ivan.getName() + ": " + ivan.getCount());
        System.out.println(alex.getName() + ": " + alex.getCount());
        System.out.println(sergey.getName() + ": " + sergey.getCount());

        System.out.println("Bank comission: " + Bank.getCommission());
    }
}