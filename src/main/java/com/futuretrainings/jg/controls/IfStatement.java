package com.futuretrainings.jg.controls;

public class IfStatement {
    final static int HECTARE = 10_000;

    public static void main(String[] args) {

        int length = 100;
        int height = 100;
        int area = length * height;

        if (area > HECTARE)
            System.out.println("Fläche " + area + " m² ist größer als 1 Ha");
        else
            System.out.println("Fläche " + area + " m² ist kleiner oder gleich als 1 Ha");

        int i = 9;
        if (i < 10) {
            i++;
            System.out.println(i);
        }
        else {
            i--;
            System.out.println(i);
        }
    }
}
