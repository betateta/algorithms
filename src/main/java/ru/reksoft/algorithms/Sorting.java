/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;


public class Sorting {
    /**
     * Сортировка пузырьком
     * @param unsortedArray неотсортированный массив
     * @return отсортированный массив
     */
    public Integer[] bubbleSort(Integer[] unsortedArray) {
        boolean isSorted = false;
        Integer currentIndex = 0;
        while (!isSorted) {
            isSorted = true;
            while (currentIndex < unsortedArray.length - 1) {
                if (unsortedArray[currentIndex] > unsortedArray[currentIndex + 1]) {
                    Integer temp = unsortedArray[currentIndex + 1];
                    unsortedArray[currentIndex + 1] = unsortedArray[currentIndex];
                    unsortedArray[currentIndex] = temp;
                    isSorted = false;
                }
                currentIndex++;
            }
            if (!isSorted) {
                currentIndex = 0;
            }
        }
        return unsortedArray;
    }

    /**
     * Сортировка выбором
     * @param unsortedArray неотсортированный массив
     * @return отсортированный массив
     */
    public Integer[] selectionSort(Integer unsortedArray) {

    }

}
