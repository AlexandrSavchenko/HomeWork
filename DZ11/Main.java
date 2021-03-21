package com.company;

import com.company.Person;

import java.util.Random;

public class Main {
    private static String[] names = {"Mark", "Jack", "John", "Bob", "Chuk"};
    private static String[] secondNames = {"Twen", "Black", "Harrison", "White", "Lake"};
    private static int arraySize = 5;
    private static int minAge = 1;
 //   private static int middleAge = 15;
    private static int maxAge = 100;

    private static int minWeight = 9;
    private static int maxWeight = 150;
    private static int minHeight = 40;
    private static int maxHeight = 220;


    public static void main(String[] args) {
	/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен
и выбирать из него случайным образом). */
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            String generatedName = names[random.nextInt(arraySize)];
            String generatedSecondName = secondNames[random.nextInt(arraySize)];
            int generatedAge = random.nextInt(maxAge - minAge) + minAge;
            int generatedWeight = random.nextInt(maxWeight - minWeight) + minWeight;
            int generatedHeight = random.nextInt(maxHeight - minHeight) + minHeight;

            try {
                Person A = new Person(generatedName, generatedSecondName, generatedAge, generatedWeight, generatedHeight);
                System.out.println("Person " + (i + 1) + ": " + A);
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
