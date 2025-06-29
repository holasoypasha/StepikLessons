package ru.pavlova.stepic.lesson5;

import java.util.Arrays;

public class ArrayExam {

    public static void main(String[] args) {
        //2 способа объявления массивов
        int nums1[];
        int[] nums2;

        //инициализация массива. массив из 4 чисел
        //new тип_данных[количество_элементов]
        int nums[];
        nums = new int[4];

        //также можнол задать конкретные значения
        int nums3[] = new int[] {1,2,3,4};
        int nums4[] = {4,3,2,1};

        int nums5[] = new int[4];
        nums5[0] = 1;
        nums5[1] = 2;
        nums5[3] = 102;
        nums5[2] = 13;
        System.out.println(nums5[2]);

        //вывод массива в консоль
        for (int i = 0; i < nums5.length; i++) {
            System.out.println(nums5[i]);
        }

        for (int i : nums5) {
            System.out.println(i);
        }

        String nums5String = Arrays.toString(nums5);
        System.out.println(nums5String);
    }




}
