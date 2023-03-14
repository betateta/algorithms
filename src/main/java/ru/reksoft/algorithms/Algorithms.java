/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;


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

        // Исключить число из массива
        Integer[] excludeResult = compare.excludeNumber(new Integer[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        for (Integer integer : excludeResult) {
            System.out.println(integer);
        }

        //Сортировка выбором
        Sorting sorting = new Sorting();
        Integer[] unsortedArray = Utils.getRandomUnsortedArray(10);
        Integer[] selectionSortResult = sorting.selectionSort(unsortedArray);
        System.out.println("Selection sort");
        for (Integer integer : selectionSortResult) {
            System.out.println(integer);
        }

        //Сортировка пузырьком
        Integer[] bubbleSortResult = sorting.bubbleSort(unsortedArray);
        System.out.println("Bubble sort");
        for (Integer integer : bubbleSortResult) {
            System.out.println(integer);
        }



    }

}
