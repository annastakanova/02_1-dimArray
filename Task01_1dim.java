//В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.

package com.epam;

public class Task01_1dim {
    public static void main(String[] args) {
        int n = 16;
        int k = 3;
        int[] aArray = new int[n];
        for (int i = 0; i < aArray.length; i++) {
            aArray[i] = i+1;
            if (aArray[i]%k == 0)
                System.out.println(aArray[i]);
        }
    }
}
