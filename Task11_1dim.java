//Даны натуральные числа а1 ,а2 ,..., аn .
// Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

package com.epam;

public class Task11_1dim {
    public static void main(String[] args) {
        int m = 6;
        int[] array = {2, -8, 1, 4, -5, 7, 0};
        for(int i = 0; i < array.length; i++) {
            if (array[i] % m > 0 && array[i] % m < m - 1) {
                System.out.println(array[i]);
            }
        }
    }
}
