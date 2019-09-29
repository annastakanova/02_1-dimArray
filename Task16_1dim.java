//Даны действительные числа a1,a2,...,an . Найти
//max(a1+a(2n), a2+a(2n−1),..., an+a(n+1)).


//не работает
package com.epam;

public class Task16_1dim {
    public static void main(String[] args) {
        double[] array = {0.2, 2.6, 4.0, 0.8, 7.0, 0.0, 6.6};
        int n = array.length;
        double maxResult = array[0]+array[2*n];

        for(int i = 0; i < array.length; i++) {
            if (array[i]+array[2*n-i+1] > maxResult)
                maxResult = array[i] + array[2*n-i+1];
            System.out.println(maxResult);
        }
    }
}
