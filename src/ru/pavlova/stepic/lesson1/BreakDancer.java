package ru.pavlova.stepic.lesson1;

public class BreakDancer extends Dancer {
    public BreakDancer(String name, int age) {
        super(name, age);
    }

    //переопределение метода dance под брейкданс танцора
    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую брейкданс!");
    }
}
