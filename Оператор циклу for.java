package com.company;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	    int count;

	    for (count = 15; count > 5; count = count -1)
	        JOptionPane.showMessageDialog(null, "Змінна циклу рівна " + count);
	    JOptionPane.showMessageDialog(null, "Цикл закінчений");
    }
}
