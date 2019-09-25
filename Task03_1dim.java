//Дана последовательность целых чисел а1 а2,..., аn .
// Выяснить, какое число встречается раньше - положительное или отрицательное

package com.epam;

public class Task03_1dim {
    public static void main(String[] args) {
        int[] aArray = {-9, 2, 4, 7};
        if (aArray[0] > 0) System.out.println("\nраньше встречается положительное");
        if (aArray[0] < 0) System.out.println("\nраньше встречается отрицательное");
    }

}
