/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;


public class Sorting {
    /**
     * Сортировка пузырьком
     *
     * @param unsortedArray неотсортированный массив
     * @return отсортированный массив
     */
    public static Integer[] bubbleSort(Integer[] unsortedArray) {
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
     *
     * @param array неотсортированный массив
     * @return отсортированный массив
     */
    public static Integer[] selectionSort(Integer[] array) {
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

    /**
     * Быстрая сортировка
     *
     * @param array неотсортированный массив
     * @return отсортированный массив
     */
    public static Integer[] quickSort(Integer[] array, Integer startIndex, Integer endIndex) {
        //Условие прекращения
        if ((endIndex - startIndex) < 1) {
            return array;
        }
        int pIndex = partition(array, startIndex, endIndex);

        quickSort(array, startIndex, pIndex - 1);
        quickSort(array, pIndex + 1, endIndex);

        return array;
    }

    /**
     * Разбивка массива на части
     *
     * @param array      массив
     * @param startIndex стартовый
     * @param endIndex   конечный
     * @return индекс разделителя
     */
    private static Integer partition(Integer[] array, Integer startIndex, Integer endIndex) {

        //Опорный элемент - крайний правый
        Integer pivot = array[endIndex];
        System.out.printf("pivot[%s] = %s%n", endIndex, pivot);
        /**
         * индекс разделительного эл-та
         * pivot встанет на это место после прохождения массива
         */
        Integer pIndex = startIndex;

        /**
         * Проходим массив, размещаем меньшие элементы в левой части
         * При свапе элемента,увеличиваем индекс разделительного элемента
         */
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] <= pivot) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        //ставим pivot на место разделительного элемента
        swap(array, endIndex, pIndex);
        return pIndex;

    }

    /**
     * Swap элементов массива
     *
     * @param array  массив
     * @param indexA индекс 1
     * @param indexB индекс 2
     * @return массив
     */
    private static Integer[] swap(Integer[] array, Integer indexA, Integer indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        return array;
    }

}
