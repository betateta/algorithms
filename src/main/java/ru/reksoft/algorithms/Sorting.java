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
        int currentIndex = 0;
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
     * @param array неотсортированный массив
     * @return отсортированный массив
     */
    public Integer[] selectionSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentIndex]) {
                    currentIndex = j;
                }
            }
            if (i != currentIndex) {
                //swap
                Integer temp = array[i];
                array[i] = array[currentIndex];
                array[currentIndex] = temp;
            }
        }
        return array;
    }


}
