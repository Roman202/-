package com.company;

public class Main {

    public static void main(String[] args) {
	    int iresult, iremain; // для ділення цілих числе
        double dresult, dremain; // для ділення дробових чисел

        // ділення цілих чисел
        iresult = 10 / 3;
        iremain = 10 % 3;
        System.out.print("Ділення 10 / 3 = ");
        System.out.println(iresult + ", Залишок = " + iremain);

        // ділення дробових чисел
        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;

        System.out.print("Ділення 10.0 / 3.0 = ");
        System.out.println(dresult + ", Залишок = " + dremain);
    }
}
