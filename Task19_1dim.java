//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

package com.epam;

public class Task19_1dim {
    public static void main(String[] args) {
        int n = 9;
        int[] keyArray = new int[] {3, 3, 2, 4, 3, 7, 8, 8, 8};
        int[] CountPopularArr = new int[n];

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++)
                if (keyArray[i] == keyArray[j])
                    CountPopularArr[i]++;
        }

        int valueResult = keyArray[0];
        int countPopular = CountPopularArr[0];

        for (int i = 1; i < n; i++) {
            if (CountPopularArr[i] > countPopular) {
                countPopular = CountPopularArr[i];
                valueResult = keyArray[i];
            }
            if ((countPopular == CountPopularArr[i]) && (keyArray[i] < valueResult)) {
                valueResult = keyArray[i];
            }
        }
        System.out.println(valueResult);
    }
}
