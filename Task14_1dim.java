//Дан одномерный массив A[N].
// Найти: max(a2,a4,...,a2k )+min(a1,a3,...,a2k+1)

package com.epam;

public class Task14_1dim {
    public static void main(String[] args) {
        int[] array = {0, 3, 2, 4, -5, 7, 8};
        int max = array[0];
        int min = array[0];
        int result = 0;

        for(int i = 1; i < array.length; i+=2) {
            if (array[i] > max)
                max = array[i];
        }
        for(int i = 0; i < array.length; i+=2) {
            if (array[i] < min)
                min = array[i];
        }
        result = max + min;
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("сумма = "+result);
    }
}
