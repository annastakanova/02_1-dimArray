//Дана последовательность целых чисел a1,a2,...,an .
// Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min( a1 , a2 ,..., an ).

package com.epam;

public class Task17_1dim {
    public static void main(String[] args) {
        int[] array = {9, 7, 3, 2, 4, 2, 7, 8, 2, 4, 8, 6, 2, 9};
            if (array.length == 0) {System.out.println("Массив нулевой длины");}
        int count = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                count = 1;
                min = array[i];}
            else if (array[i] == min) {
                    count++;
                }
        }
        int m = array.length - count;
        System.out.println("длина нового массива = " + array.length + " - " +count + " = " + m);

        int[] resArray = new int[m];
        int ii = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] == min)
                ii++;
            else {
                resArray[ii] = array[i];
                System.out.print(resArray[ii] + ", ");
            }
        }
    }
}
