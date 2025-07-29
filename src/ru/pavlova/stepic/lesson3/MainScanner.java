package ru.pavlova.stepic.lesson3;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {

        //Создали объект сканера и указали для него источник данных
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");

        //Метод nextLine() обращается к источнику данных, находит следующую строку, которую он еще не считывал и возвращает ее
        //Здесь мы выводим каждую строку отдельно

        /*String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        */

        //или же просто вывести все с помощью цикла while
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        //Создаем новый объект сканера
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите число:");

        //метод hasNextInt проверяет, являются ли введеные данные числом
        if (sc.hasNextInt()) {
            //метод nextInt считывает и возвращает введеное число
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        }
        else {
            System.out.println("Неправильный ввод. Перезапустите программу и повторите снова");
        }

        sc.close();

        Scanner scan = new Scanner("\nНа голой ветке'" +
                "Ворон сидит одиноко.'" +
                "Осенний вечер." +
                "''***''" +
                "В небе такая луна,'" +
                "Словно дерево спилено под корень:'" +
                "Белеет свежий срез." +
                "''***''" +
                "Как разлилась река!'" +
                "Цапля бредет на коротких ножках,'" +
                "По колено в воде.");

        //метод useDelimeter() отвечает за деление входящих данных на части
        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
    }
}