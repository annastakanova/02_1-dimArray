package com.epam;

//«Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек,
// в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
// когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
// (Игральный кубик имеет на каждой грани от 1 до 6 точек).
// Напишите программу, которая разгадывает код замка при условии,
// что два кубика уже вставлены в ячейки.

public class Task18_1dim {
    public static void main(String[] args) {
        int n = 10;
        int[] keyArray = new int[n];
        keyArray[0] = 2;
        keyArray[1] = 3;
        System.out.print(keyArray[0] + ", ");
        System.out.print(keyArray[1] + ", ");

        if (keyArray[0]+keyArray[1] > 10 || keyArray[0]+keyArray[1]  < 4)
            System.out.print("\nрасшифровка невозможна");

        else
            for (int i=2; i<n; i++){
                keyArray[i] = 10 - keyArray[i-1] - keyArray[i-2];
                System.out.print(keyArray[i]  + ", ");
        }
    }
}
