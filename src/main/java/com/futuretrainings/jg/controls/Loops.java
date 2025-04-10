package com.futuretrainings.jg.controls;

public class Loops {
    public static void main(String[] args) {
        // Kopfgesteuerte oder abweisende Schleife
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if(i==5) {     //break;
                i++;
                continue;
            }
            System.out.println(".");
        }


        // Fußgesteuerte oder nicht abweisende Schleife
        do {
            i--;
            System.out.println(i);
        } while(i > 0);

        // Zählschleife
        for ( int j = 0; j < 10; j++ ) {
            System.out.println(j);
            for (int k = j; k < 4; k++) {
                System.out.println("k = " + k);
            }
        }

        int[] liste = { 0, 1, 2, 3, 4, 5, 6, 7 };

        // for..each-Loop
        for(int wert: liste) {
            System.out.println(wert);
        }

        System.out.println(liste.length);
    }
}
