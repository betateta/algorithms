/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

import java.util.Objects;

public class Algorithms {
    public static void main(String[] args) {
        /* всегда ищем отрицательное число, чтобы полностью пройти по массиву */

        linearSearch(getRandomUnsortedArray(10),-1);
        binarySearch(getRandomSortedArray(10),0);
        binarySearch(getRandomSortedArray(10),9);
        linearSearch(getRandomUnsortedArray(100),-1);
        binarySearch(getRandomSortedArray(100),-1);
        linearSearch(getRandomUnsortedArray(1000),-1);
        binarySearch(getRandomSortedArray(1000),-1);
        linearSearch(getRandomUnsortedArray(10000),-1);
        binarySearch(getRandomSortedArray(10000),-1);

    }

    /**
     * Метод возвращает индекс первого найденного элемента
     * В случае, если элемент не найден вернется -1
     * @param array массив
     * @param obj искомый объект
     * @return индекс элемента
     */
    private static Integer linearSearch(Object[] array, Object obj) {
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
     * @param array отсортированный массив
     * @param number искомый объект
     * @return индекс элемента
     */
    private static Integer binarySearch(Integer[] array, Integer number) {
        System.out.println("Длина массива (двоичный поиск) : " + array.length);
        long startTime = System.nanoTime();
        /* текущий элемент */
        Integer currentIndex;
        /* диапазон */
        Integer startIndex = 0;
        Integer endIndex = array.length - 1;

        //граничный случай
        if (Objects.equals(number, array[endIndex])) {
            printTime(startTime);
            return endIndex;
        }
        while (startIndex < endIndex) {
            currentIndex = (startIndex + endIndex) >> 1;
            if (Objects.equals(number, array[currentIndex])) {
                printTime(startTime);
                return currentIndex;
            } else if (number < array[currentIndex]) {
                endIndex = currentIndex;
            } else if (number > array[currentIndex]) {
                startIndex = currentIndex;
            }
        }
        printTime(startTime);
        return -1;
    }


    /**
     * Метод возвращает случайный массив заданной длинны
     * @param size  размер массива
     * @return массив
     */
    private static Integer[] getRandomUnsortedArray(Integer size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }

    /**
     * Метод возвращает отсортированный массив заданной длинны
     * @param size  размер массива
     * @return массив
     */
    private static Integer[] getRandomSortedArray(Integer size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    /**
     * Метод печатает в консоль время выполнения
     * @param start время старта
     */
    private static void printTime(long start) {
        long stop = System.nanoTime();
        System.out.println("Затраченное время, нс: " + (stop - start));
    }
}
