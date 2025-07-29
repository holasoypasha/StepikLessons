package ru.pavlova.stepic.lesson5;

import java.util.Arrays;

public class DimArraysExam {
    public static void main(String[] args) {
        //Двумерный массив

        //Объявление, создание и инициализация двумерных массивов
        int[][] arr1 = {{1,2,3,4}, {5,6,7,8}};
        int[][] arr2 = new int[2][4];

        //Заполнение массива
        arr2[0][0] = 5;
        arr2[1][3] = 19;
        arr2[1][0] = 301;

        //Вывод двумерного массива
        for (int i = 0; i < 2; i++) { //по строкам
            for (int j = 0; j < 4; j++) { //по столбцам
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //Быстрый вывод массива
        System.out.println(Arrays.deepToString(arr2));

        //Зубчатый массив
        int[][] arr3 = new int[3][];

        arr3[0] = new int[2];
        arr3[1] = new int[5];
        arr3[2] = new int[3];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        };

        //Трехмерный массив

        //создаем трехмерный массив, состоящий из двух двухмерных массивов
        int[][][] threeDimArr = new int[2][][];

        //создаем первый двумерный массив трехмерного массива
        threeDimArr[0] = new int[5][2];
        //создаем второй двумерный массив трехмерного массива
        threeDimArr[1] = new int[1][1];

        threeDimArr[0][2][0] = 5;

        System.out.println(Arrays.deepToString(threeDimArr));
    }
}
