//Дана последовательность натуральных чисел а1 , а2 ,..., ап.
// Создать массив из четных чисел этой последовательности.
// Если таких чисел нет, то вывести сообщение об этом факте.

package com.epam;

public class Task05_1dim {
    public static void main(String[] args) {
        int[] array = {0, 3, 2, 4, 0, 7, 8};
        //int[] array = {3, 3};
        int[] arrayNew = new int[array.length]; //чтобы не считать кол-во четных чисел, просто создаем массив той же длины, что и исходный
        int m = 0;
        boolean isEven = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                arrayNew[m]=array[i];
                System.out.println(arrayNew[m]);
                m++;
            }
        }
        if (m == 0) System.out.println("четных чисел нет");
    }
}
