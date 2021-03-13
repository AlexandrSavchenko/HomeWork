package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TASK02 {
    // 2) Попросить пользователя ввести строку и имя файла. Записать строку в файл.
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите имя файла и текст.");
        System.out.print("Имя файла: ");
        StringBuilder sb = new StringBuilder(SCANNER.nextLine());
        String fileName = sb.toString();
        sb.delete(0, sb.length());
        System.out.print("Текст: ");
        sb.append(SCANNER.nextLine());
        String text = sb.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

