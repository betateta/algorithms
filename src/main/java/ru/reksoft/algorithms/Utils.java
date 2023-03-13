/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;


public class Utils {
    /**
     * Метод возвращает случайный массив заданной длинны
     *
     * @param size размер массива
     * @return массив
     */
    public static Integer[] getRandomUnsortedArray(Integer size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }

    /**
     * Метод возвращает отсортированный массив заданной длинны
     *
     * @param size размер массива
     * @return массив
     */
    public static Integer[] getRandomSortedArray(Integer size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    /**
     * Метод печатает в консоль время выполнения
     *
     * @param start время старта
     */
    public static void printTime(long start) {
        long stop = System.nanoTime();
        // System.out.println("Затраченное время, нс: " + (stop - start));
    }
}
