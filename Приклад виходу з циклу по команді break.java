package com.company;

public class Main {

    public static void main(String[] args) {

        int nmax = 17;
        for (int n = 0; n < nmax; n++) {

            /* цикл виконується до тих пір поки квадрат числа n не стане більше 25 */

            if ((n * n) >= nmax) break;
            System.out.println("n = " + n + ", n в квадраті = " + n * n);
        } // for
        System.out.println("Кінець цикла");
    }
}
