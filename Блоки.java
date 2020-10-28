package com.company;
// приклад використання блоків для виконання декількох
import javax.swing.*;
public class Main {

    public static void main(String[] args) {

	    double i, j, d;

	    i = 10;
	    j = 150;

	    if (i != 0) {
	        JOptionPane.showMessageDialog(null, "Знаменник не рівний нулю");
	        d = j / i;
	        JOptionPane.showMessageDialog(null, "j / i рівно " + d);
        } // if (i != 0)
    }
}
