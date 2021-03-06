package com.company;

public class TASK01 {
    /* 1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная
комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). */
    public static void main(String[] args) {
        int sum = 0;
        for (int h = 00; h < 24; h++) {
            for (int m = 00; m <= 59; m++) {
                int numberHh = h / 10;
                int numberhH = h % 10;
                int numberMm = m / 10;
                int numbermM = m % 10;
                if (numberhH == numberMm && numberHh == numbermM) {
                    sum++;
                }
            }
        }
        System.out.println(sum + " симетричных комбинаций.");
    }
}
