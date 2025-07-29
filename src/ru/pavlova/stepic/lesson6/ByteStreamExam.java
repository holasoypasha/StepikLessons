package ru.pavlova.stepic.lesson6;

import java.io.*;

public class ByteStreamExam {
    public static void main(String[] args) {
        //Путь к файлу
        String scr = "C:\\Users\\klavi\\IdeaProjects\\StepicLessons\\log.txt";
        String dest = "C:\\Users\\klavi\\IdeaProjects\\StepicLessons\\copy.txt";

        try {
            //Создаем файл log.txt
            File scrFile = new File(scr);
            if (scrFile.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }

            //Создаем файл copy.txt
            File destFile = new File(dest);
            if (destFile.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try (FileInputStream input = new FileInputStream(scr); //InputStream для чтения из файла
             FileOutputStream output = new FileOutputStream(dest)) {   //OutputStream для записи в файл
            byte[] buffer = new byte[65536];
            //Буфер, в который будем считывать данные, пока данные есть в потоке
            while (input.available() > 0) {
                //Считываем данные в буфер
                int real = input.read(buffer);
                //Записываем данные из буфера во второй поток
                output.write(buffer, 0, real);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
