//Дана последовательность чисел а1 ,а2 ,..., аn.
// Указать наименьшую длину числовой оси, содержащую все эти числа

package com.epam;

public class Task06_1dim {
    public static void main(String[] args) {
        int[] array = {0, 3, 2, 4, -5, 7, 8};
        int max = array[0];
        int min = array[0];
        int len = 0;

        for(int i = 1; i < array.length; i++) {
                if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        len = max-min;
        System.out.println("наименьшая длина числовой оси, содержащую все данные числа = "+len);
    }
}
