package com.company;

import java.util.Scanner;

public class TASK01 {
    // 1) банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите суму денег на счету");
        double sum = scanner.nextInt();
        System.out.println("Введите количество лет");
        int numberOfYears = scanner.nextInt();
        System.out.println(sumAfterYears(sum, numberOfYears));
    }

    private static double sumAfterYears(double sum, int numberOfYears) {
        for (int i = 1; i <= numberOfYears * 12; i++) {
            sum += sum * 0.015;
        }
        return sum;
    }
}
