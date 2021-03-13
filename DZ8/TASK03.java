package com.company;

public class TASK03 {
    /* 3*) Написать метод.
    Входящий параметр:
    Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
    Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие */
    public static void main(String[] args) {
        String text = "Hello java world";
        System.out.println(methodFirstBig(text));
    }

    private static String methodFirstBig(String text) {
        String[] words = text.split(" ");
        int length = text.length();
        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            text += first + all + " ";
        }
        text = text.substring(length);
        return text;
    }
}

