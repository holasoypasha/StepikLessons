package ru.pavlova.stepic.lesson6;

import javax.xml.transform.Source;
import java.io.*;
import java.util.Scanner;

public class SymbolicStreamExam {
    public static void main(String[] args) {
        String secondScr = "C:\\Users\\klavi\\IdeaProjects\\StepicLessons\\secondLog.txt";
        String secondDest = "C:\\Users\\klavi\\IdeaProjects\\StepicLessons\\secondCopy.txt";

        Scanner scanner = new Scanner(System.in);

        try {
            File secondScrFile = new File(secondScr);
            if (secondScrFile.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже создан");
            }

            File secondDestFile = new File(secondDest);
            if (secondDestFile.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже создан");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Введите текст для записи в файл:");

        try (FileWriter writer = new FileWriter(secondScr)) {
            while (true) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                writer.write(line + "\n"); // Добавляем перенос строки
            }
            System.out.println("Текст записан в файл!");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try (FileReader reader = new FileReader(secondScr);
             FileWriter writer = new FileWriter(secondDest)) {
            char[] buffer = new char[65536];
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
            System.out.println("Содержимое скопированно в файл!");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try (BufferedReader reader2 = new BufferedReader(new FileReader(secondDest))) {
            String line;
            System.out.println("Содержимое второго файла:");
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}

