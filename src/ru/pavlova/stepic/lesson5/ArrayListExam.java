package ru.pavlova.stepic.lesson5;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        //создание списка людей
        ArrayList<String> people = new ArrayList<String>();

        // добавим в список ряд элементов
        people.add("Том");
        people.add("Алиса");
        people.add("Катя");
        people.add("Сэм");
        people.add(1, "Боб"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект

        // установка нового значения для 2-го объекта
        people.set(1, "Роберт");

        System.out.printf("У ArrayList %d элементов \n", people.size());

        for(String person : people) {
            System.out.println(person);
        }

        // проверяем наличие элемента
        if(people.contains("Том")){

            System.out.println("В ArrayList есть Том");
        }

        // удалим несколько объектов

        // удаление конкретного элемента
        people.remove("Роберт");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}
