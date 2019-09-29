//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

package com.epam;

public class Task20_1dim {
    public static void main(String[] args) {
        int n =9;
        int[] array = {6, 3, 2, 4, -5, 7, 8, 4, 0};


        for(int i = 0; i < (n+1)/2; i++) {
            array[i] = array[2*i];
            System.out.print(array[i] + ", ");
        }

    }
}
