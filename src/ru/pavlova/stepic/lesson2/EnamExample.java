package ru.pavlova.stepic.lesson2;

public class EnamExample {
    enum CoffeeSize { SMALL(100), MEDIUM(200), BIG(300);
        private int millilitres;
        CoffeeSize(int millilitres) {
            this.millilitres = millilitres;
        }

        public int getMillilitres() {
            return millilitres;
        }
    }

    public static void main(String[] args) {
        CoffeeSize coffeSize = CoffeeSize.BIG;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMillilitres());
    }
}
