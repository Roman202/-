package com.company;
import javax.swing.*;

//Демонстрація команди if

public class Main {

    public static void main(String[] args) {

        int a, b, c, d;

        a = 2;
        b = 3;

        JOptionPane.showMessageDialog(null, "a рівно 2, b рівно 3");
        if (a < b) JOptionPane.showMessageDialog(null, "a меньше b");
        if (a > b) JOptionPane.showMessageDialog(null, "Цей текст ви ніколи не побачите");
        c = a - b; // c буде рівне -1
        JOptionPane.showMessageDialog( null,"c рівне -1");
        if (c >= 0) JOptionPane.showMessageDialog(null, "c має положительноє значення");
        if (c < 0) JOptionPane.showMessageDialog(null, "c має протилежне значення");

        d = b - a; // d рівне 1
        JOptionPane.showMessageDialog(null, "d рівно 1");
        if (d >= 0) JOptionPane.showMessageDialog(null, "d має положительноє значення");
        if (d < 0) JOptionPane.showMessageDialog(null, "c має протилежне значення");

        if (a + c != b) JOptionPane.showMessageDialog(null, "а плюс с не рівняється b");
        if (a + c == b) JOptionPane.showMessageDialog(null, "а плюс d рівняється b");


    }
}
