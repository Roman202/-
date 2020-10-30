package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        System.out.println("count = " + count);

        {
            // помилка: зміннна count вже визначена.
            // Закоментуйте насттупне поле
            // int count = 2;
            System.out.println("Перший незалежний блок : count = " + count);

            int n = 3;
            System.out.println("Перший незалежний блок: n = " + n);
        }
        {
            int n = 5;
            System.out.println("Другий незалежний блок: n = " + n);
        }
    } // main(String[]) method
}
