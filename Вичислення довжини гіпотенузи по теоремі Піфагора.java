package com.company;
// Вичислення довжини гіпотенузи по теоремі Піфагора
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	double cathetus1, cathetus2, hypot;

	cathetus1 = 5; // довжина першого катета
    cathetus2 = 4; // довжина другого катета

    hypot = Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2));

    JOptionPane.showMessageDialog(null, "В даній програмі використовується теорема Піфагора (Квадрат гіпотенузи дорівнює сумі квадратів катетів) ");
    JOptionPane.showMessageDialog(null, "Довжина першого катета = " + cathetus1);
    JOptionPane.showMessageDialog(null, "Довжина другого катета = " + cathetus2);
    JOptionPane.showMessageDialog(null, "Довжина гипотенузи = " + hypot);
    }
}
