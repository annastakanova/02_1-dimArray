//Дана последовательность действительных чисел a1,a2,...,an.
// Указать те ее элементы, которые принадлежат отрезку [с, d].

package com.epam;

public class Task15_1dim {
    public static void main(String[] args) {
        int c = 4;
        int d = 9;
        double[] array = {0.2, -2.6, 4.0, -0.8, 7.0, 0.0, -6.6, 4.3, 9.8, 3.2, 1.7};
        for(int i = 4; i < 9; i++) {
            System.out.println(array[i]);

        }
    }
}
