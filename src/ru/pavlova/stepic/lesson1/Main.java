package ru.pavlova.stepic.lesson1;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);
        Dancer breakDDancer = new BreakDancer("Леша", 19);
        Dancer electricDDancer = new ElectricDancer("Катя", 20);

        dancer.dance();
        breakDDancer.dance();
        electricDDancer.dance();

        HipHopDancer hipHopDancer = new HipHopDancer("Стас", 27);

    }
}