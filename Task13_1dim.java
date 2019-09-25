//Определить количество элементов последовательности натуральных чисел,
// кратных числу М и заключенных в промежутке от L до N.

package com.epam;

public class Task13_1dim {

    public static void main(String[] args) {
        int[] array = {2, -8, 6, 1, 4, -5, -6, 7, 0, 3};
        int m=3;
        int l = -6;
        int n = 6;
        int quantity = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] >= l && array[i] <= n)
                quantity++;
        }
        System.out.println(quantity);
    }
}
