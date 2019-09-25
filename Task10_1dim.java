//Даны целые числа а1 ,а2 ,..., аn .
// Вывести на печать только те числа, для которых аi > i.

package com.epam;

public class Task10_1dim {
    public static void main(String[] args) {
        int[] array = {2, 8, 1, 4, -5, 7, 0};
        for(int i = 1; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
