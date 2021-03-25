package com.company;

public class Main {

    public static void main(String[] args) {
        /* Необходимо создать класс аналогичный стандартному ArrayList<Integer> на базе массива.
И реализовать 5 методов:
add - добавить значеине в список
get - получить по индексу
set - заменить по индексу
size - верзнуть размер, изначально 0
toString - красиво печатет список
Логика метода add:
создаем временный массив на 1 елемент больше чем arr, копируем в него все элементы из arr,
на последнюю позицию записыаем новый елемент и заменяем arr на временный массив.
         */
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 123);
        System.out.println(list); // [10, 123, 30]
        System.out.println("Array size: " + list.size());
        System.out.println("Last element: " + list.get(list.size() - 1));
    }
}

