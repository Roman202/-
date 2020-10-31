package com.company;

public class Main {

    public static void main(String[] args) {

        for (int num = 0; num <= 10; num++) {
            if ((num % 2) == 0) continue;
            System.out.println(num);
        }
    }
}
