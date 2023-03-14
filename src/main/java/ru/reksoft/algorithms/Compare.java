/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

import java.util.Arrays;
import java.util.Objects;

public class Compare {
    /**
     * Метод сравнивает два отсортированных массива
     * @param a массив a
     * @param b массив b
     * @return разница между массивами
     */

    public Object[] compareArray(Integer[] a, Integer[] b) {
        for (int i = 0; i < a.length; i++) {
            //Если эл-т найден, заменяем его на null
            if (!Searching.binarySearch(b, a[i]).equals(-1)) {
                a[i] = null;
            }
        }
        return Arrays.stream(a).filter(Objects::nonNull).toArray();
    }

    /**
     * Из исходного массива исключаем число
     * @param array массив
     * @param number число
     * @return массив
     */
    public Integer[] excludeNumber(Integer[] array, Integer number) {
        Integer[] temp = new Integer[array.length];
        //индекс последнего перенесенного эл-та
        int index = 0;
        for (Integer integer : array) {
            if (!integer.equals(number)) {
                temp[index] = integer;
                index++;
            }
        }
        Integer[] result = new Integer[index];
        System.arraycopy(temp, 0, result, 0, result.length);
        return result;
    }

}
