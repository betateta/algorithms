/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

import static ru.reksoft.algorithms.Utils.printTime;

import java.util.Objects;

public class Searching {

    /**
     * Метод возвращает индекс первого найденного элемента
     * В случае, если элемент не найден вернется -1
     *
     * @param array массив
     * @param obj   искомый объект
     * @return индекс элемента
     */
    public static Integer linearSearch(Object[] array, Object obj) {
        System.out.println("Длина массива (линейный поиск) : " + array.length);
        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i]) && (obj == array[i])) {
                System.out.println("Индекс элемента = " + i);
                printTime(startTime);
                return i;
            }
        }
        printTime(startTime);
        return -1;
    }

    /**
     * Метод возвращает индекс первого найденного элемента
     * В случае, если элемент не найден вернется -1
     *
     * @param array  отсортированный массив
     * @param number искомый объект
     * @return индекс элемента
     */
    public static Integer binarySearch(Integer[] array, Integer number) {
        // System.out.println("Длина массива (двоичный поиск) : " + array.length);
        long startTime = System.nanoTime();
        /* текущий элемент */
        Integer currentIndex;
        /* диапазон */
        Integer startIndex = 0;
        Integer endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            currentIndex = (startIndex + endIndex) >> 1;
            if (Objects.equals(number, array[currentIndex])) {
                printTime(startTime);
                return currentIndex;
            } else if (number < array[currentIndex]) {
                endIndex = currentIndex - 1;
            } else if (number > array[currentIndex]) {
                startIndex = currentIndex + 1;
            }
        }
        printTime(startTime);
        return -1;
    }

    /**
     * Метод возвращает индекс первого найденного элемента
     *  В случае, если элемент не найден вернется -1
     * @param array отсортированный массив
     * @param number искомое
     * @param startIndex текущий индекс
     * @param endIndex текущий индекс
     * @return индекс
     */
    public static Integer binaryRecursiveSearch(Integer[] array, Integer number, Integer startIndex, Integer endIndex) {

        Integer currentIndex = (startIndex + endIndex) >> 1;
        /* условие продолжения работы */
        if (startIndex <= endIndex) {
            if (Objects.equals(number, array[currentIndex])) {
                return currentIndex;
            } else if (number < array[currentIndex]) {
                endIndex = currentIndex - 1;
            } else if (number > array[currentIndex]) {
                startIndex = currentIndex + 1;
            }
            return binaryRecursiveSearch(array, number, startIndex, endIndex);
        }
        return -1;

    }




}
