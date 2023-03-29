/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

import static ru.reksoft.algorithms.Utils.getRandomSortedArray;

import java.util.Arrays;

public class Algorithms {

    @SuppressWarnings("checkstyle:JavadocMethod")
    public static void main(String[] args) {

        // Сравнение массивов
        Compare compare = new Compare();
        Integer[] a = {3, 4, 5, 11, 32};
        Integer[] b = {2, 3, 5, 11};
        Object[] compareResult = compare.compareArray(a, b);

        for (Object o : compareResult) {
            System.out.println(o);
        }

        //Сортировка выбором

        Integer[] unsortedArray = Utils.getRandomUnsortedArray(10);
        Integer[] selectionSortResult = Sorting.selectionSort(unsortedArray);
        System.out.println("Selection sort");
        for (Integer integer : selectionSortResult) {
            System.out.println(integer);
        }

        //Сортировка пузырьком
        Integer[] bubbleSortResult = Sorting.bubbleSort(unsortedArray);
        System.out.println("Bubble sort");
        for (Integer integer : bubbleSortResult) {
            System.out.println(integer);
        }

        // Исключить число из массива
        Integer[] excludeResult = compare.excludeNumber(new Integer[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        for (Integer integer : excludeResult) {
            System.out.println(integer);
        }

        //мин, макс и средние значения в массиве
        ArraysCommons arraysCommons = new ArraysCommons();
        arraysCommons.printArrayInfo(Utils.getRandomUnsortedArray(10));

        //бинарный рекурсивный поиск
        Integer[] sortedArray = getRandomSortedArray(10);
        System.out.println("Рекурсивный поиск бинарный поиск: ");
        System.out.println(Searching.binaryRecursiveSearch(sortedArray, 10, 0, (sortedArray.length - 1)));

        //быстрая сортировка
        System.out.println("Быстрая сортировка");
        Integer[] unsortedQuickArray = new Integer[]{20, 7,-6};
        System.out.println(Arrays.toString(unsortedQuickArray));
        Sorting.quickSort(unsortedQuickArray, 1, unsortedQuickArray.length - 1);
        System.out.println(Arrays.toString(unsortedQuickArray));

        //сортировка слиянием
        System.out.println("сортировка слиянием");
        System.out.println(Arrays.toString(Sorting.mergeSort(new int[]{11, 7, 8, 80, 4, 2, 9, 1, -8, 0, 4})));

        //Проверка анаграмм
        String s1 = "липа";
        String s2 = "пила";
        String s3 = "лапа";

        System.out.println(Compare.isAnagram(s1, s2));// true
        System.out.println(Compare.isAnagram(s1, s3));// false


    }


}
