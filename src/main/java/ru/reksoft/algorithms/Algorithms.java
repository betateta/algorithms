/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

public class Algorithms {

    public static void main(String[] args) {

        // Сравнение массивов
        /*
        Compare compare = new Compare();
        Integer[] a = {3, 4, 5, 11, 32};
        Integer[] b = {2, 3, 5, 11};
        Object[] result = compare.compareArray(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/

        //Сортировка
        Sorting sorting = new Sorting();
        Integer[] unsortedArray = Utils.getRandomUnsortedArray(10);
        Integer[] result = sorting.bubbleSort(unsortedArray);
        System.out.println("Sort");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
