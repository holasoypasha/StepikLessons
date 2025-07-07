package ru.pavlova.stepic.lesson1.dance;

public class Dancer {
    /**
     * имя танцора
     */
    private String name;
    /**
     * возраст танцора
     */
    private int age;

    /**
     * Конструктор с именем и возрастом
     * @param name имя
     * @param age возраст
     */
    public Dancer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println(toString() + "Я танцую как все!");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. ";
    }
}
