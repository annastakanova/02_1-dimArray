//Даны действительные числа а1 ,а2 ,..., аn .
// Поменять местами наибольший и наименьший элементы.

package com.epam;

public class Task09_1dim {
    public static void main(String[] args) {
        int[] array = {2, 8, 1, 4, -5, 7, 0};
        int max = array[0];
        int min = array[0];
        int temp;
        int maxInd = 0;
        int minInd = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxInd = i;
                }
            if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        temp = array[maxInd];
        array[maxInd] = array[minInd];
        array[minInd] = temp;

        System.out.println(java.util.Arrays.toString(array));
    }
}
