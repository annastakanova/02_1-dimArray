//Дана последовательность действительных чисел а1 а2 ,..., аn .
// Выяснить, будет ли она возрастающей

package com.epam;

public class Task04_1dim {
    public static void main(String[] args) {
        double[] array = {0.2, 2.6, 4.0, 0.8, 7.0, 8.7};
        boolean isBigger = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isBigger = false;
                break;}
            isBigger = true;
        }
        if (isBigger) System.out.println("является возрастающей");
        if (!isBigger) System.out.println("не является возрастающей");
    }
}
