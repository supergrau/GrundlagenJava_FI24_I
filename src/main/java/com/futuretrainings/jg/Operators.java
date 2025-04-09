package com.futuretrainings.jg;

public class Operators {
    public static void main(String[] args) {
        /*
        Grundrechenarten: +, -, ,*, /
         */
        int numberOfClients = 23;
        double price = 50.0;
        int numberOfHours = 7;
        double tax = price * 1.19 - price;

        System.out.println(numberOfHours * numberOfClients * price);
        System.out.println(tax);

        int value1 = 13;
        int value2 = 5;

        /*
        Modulo: %
         */
        System.out.println(value1 % value2);

        value1 = 2; value2 = 3;
        System.out.println(Math.pow(value1, value2));

        /*
        logische Operatoren: && (und), || (oder) ! (nicht)
         */

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true || false); // true
        System.out.println(true ^ false); // true
        System.out.println((1 == 1) ^ ( 2 > 4)); // true

        boolean b = value1 == value2;
        System.out.println(b);

        System.out.println(( value1 > value2 ) ? "Wahr" : "Falsch");
        System.out.println();

        int bits = 1; // b0001
        int bit1 = 0b0001, bit2 = 0b0011;
        System.out.println(bits << 2); // b0010, b0100
        System.out.println(bit1 & bit2);
        System.out.println(bit1 | bit2);
        System.out.println(bit1 ^ bit2);
    }
}
