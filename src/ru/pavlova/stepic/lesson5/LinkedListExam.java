package ru.pavlova.stepic.lesson5;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Masha");
        String str3 = new String("I love Java");
        String str4 = new String("Первый элемент");
        String str5 = new String("Последний элемент");

        LinkedList<String> bio = new LinkedList<>();
        //добавление элементов в список
        bio.add(str1);
        bio.add(str3);
        //добавление элемента по индексу
        bio.add(1, str2);

        //удаление элемента из списка
        bio.remove(1);

        //добавление элемента в начало списка
        bio.addFirst(str4);
        //добавление элемента в конец списка
        bio.addLast(str5);

        System.out.println(bio);
    }
}
