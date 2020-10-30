package com.company;

public class Main {

    public static void main(String[] args) {

        // ці змінні ініціалізуються константами
        double radius = 4; // радіус циліндра
        double height = 5; // висота циліндра

        // змінна volume ініціалізується динамічно вичисленими значенням вираження

        double volume = 3.1416 * radius * radius * height;
        System.out.println("Об'єм циліндра = " + volume);
    }
}
