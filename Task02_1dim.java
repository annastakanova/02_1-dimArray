//В целочисленной последовательности есть нулевые элементы.
// Создать массив из номеров этих элементов

package com.epam;

public class Task02_1dim {
    public static void main(String[] args) {
        //считаем нули, чтобы знать длину нового массива
        int[] aArray = {0, 2, 4, 0, 7, 8, 0, 3, 0, 3, 9, 11, 0};
        int count = 0;
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == 0)
                count++;
        }
        //System.out.println(count0);

        //новый массив
        int[] newArray = new int[count];
        int temp = 0;
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == 0)
                {newArray[temp] = i;
                System.out.println(newArray[temp]);
                temp++;
                }
        }
    }
}