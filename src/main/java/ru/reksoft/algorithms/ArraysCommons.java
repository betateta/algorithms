/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

public class ArraysCommons {
    /**
     * Метод печатает мин, макс и среднее значения
     * @param array массив
     */
    public void printArrayInfo(Integer[] array) {
        int min = array[0];
        int max = array[0];
        int average = 0;
        for (int i = 1; i < array.length; i++) {
            average += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        average = average / array.length;
        System.out.println("Min  = " + min + " Max = " + max + " Average = " + average);
    }
}
