package ru.pavlova.stepic.lesson2;

public class Program {

    public static void main(String[] args) {
        //Создаем объект класса Book
        Book b1 = new Book("Игра престолов", "Джордж Р. Р. Мартин", Type.FANTASY);
        System.out.printf("Книга '%s' является представителем жанра %s \n", b1.getName(), b1.getType());

        //метод values() возвращает массив всех констант перечисления
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

        //метод ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0)
        System.out.println(Type.SCIENCE_FICTION.ordinal());

        //выводим код цветов
        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());
    }
}