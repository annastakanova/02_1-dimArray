//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

package com.epam;

public class Task07_1dim {
    public static void main(String[] args) {
        double[] array = {0.2, 2.6, 4.0, 0.8, 7.0, 8.7, 6.6, 4.3, 9.8, 3.2, 1.7};
        double z = 5.1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = 5.1;
                count++;
            }
        }
        System.out.println("количество замен = "+count);
        System.out.println(java.util.Arrays.toString(array));
    }
}
