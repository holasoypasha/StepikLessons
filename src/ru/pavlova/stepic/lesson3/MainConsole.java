package ru.pavlova.stepic.lesson3;

import java.io.Console;

public class MainConsole {
    public static void main(String[] args) {

        // создаем объект консоли
        Console console = System.console();

        if (console != null) {
            // метод readLine(): считывает с консоли введенную пользователем строку
            String login = console.readLine("Введите логин:");

            //метод readPassword(): считывает с консоли введенную пользователем строку, при этом символы строки не отображаются на консоли
            char[] password = console.readPassword("Введите пароль:");

            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(password));
        }
    }
}
