//Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

package com.epam;
import java.util.Random;

public class Task12_1dim {
    public static void main(String[] args) {
        double[] arr = {2.0, 8.3, 1.1, 4.0, -5.9, 7.4, 0};
        double sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (isPrime(i)) {
                sum+=arr[i];
            }
        }
        System.out.println("Summ: " + sum);

    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
