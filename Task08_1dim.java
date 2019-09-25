//Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

package com.epam;

public class Task08_1dim {
    public static void main(String[] args) {
        double[] array = {0.2, -2.6, 4.0, -0.8, 7.0, 0.0, -6.6, 4.3, 9.8, 3.2, 1.7};
        int zeroes = 0;
        int negs = 0;
        int posits = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) zeroes++;
            if (array[i] < 0) negs++;
            if (array[i] > 0) posits++;
        }
        System.out.println("нулевых = "+ zeroes);
        System.out.println("отрицательных = "+ negs);
        System.out.println("положительных = "+ posits);
    }
}
