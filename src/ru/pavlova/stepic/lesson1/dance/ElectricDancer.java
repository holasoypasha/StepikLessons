package ru.pavlova.stepic.lesson1.dance;

public class ElectricDancer extends Dancer {
    public ElectricDancer(String name, int age) {
        super(name, age);
    }

    //переопределение метода dance под электрик танцора
    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую электрик!");
    }

}
