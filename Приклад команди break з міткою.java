package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {

            Блок1: {
                Блок2: {
                    Блок3: {

                    System.out.println("\ni = " + i);
                    if (i == 1) break Блок1;
                    if (i == 2) break Блок2;
                    if (i == 3) break Блок3;

                    // ця команда ніколи не буде виконана.
                    System.out.println("Цей рядкок ніколи не буде надрукований");

                    } // кінець блока Блок3
                System.out.println("Завершений Блок3");
                } // кінець блока Блок2
            System.out.println("Завершений Блок2");
            } // кінець блока Блок1
        System.out.println("Завершений Блок1");

        } // for
    System.out.println("кінець цикла for");
    }
}
