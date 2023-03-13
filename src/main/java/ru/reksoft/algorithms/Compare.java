/*
 * Reksoft. Do not reproduce without permission in writing.
 * Copyright (c) 2023 Reksoft. All rights reserved.
 */

package ru.reksoft.algorithms;

import java.util.Arrays;

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
        return Arrays.stream(a).filter(num -> num != null).toArray();
    }
}
