//Даны действительные числа a1,a2,...,an . Найти
//max(a1+a(2n), a2+a(2n−1),..., an+a(n+1)).


//не поняла условие

package com.epam;

public class Task16_1dim {
    public static void main(String[] args) {
        double[] array = {0.2, 2.6, 4.0, 9.8, 7.0, 0.0, 2.0};
        int n = array.length;
        double maxResult = array[0] + 2*array[n];
        System.out.println(maxResult);

        for(int i = 0; i<n; i++) {
            if (array[i]+array[2*n-i+1] > maxResult)
                maxResult = array[i] + 2*array[n-i+1];
            System.out.println(maxResult);
        }
    }
}
