package com.futuretrainings.jg;

public class Methods05 {
    public static void main(String[] args) {
        increment(15);
    }

    // Rekursion
    static void increment( int value ) {
        System.out.println(value);
        if (value == 0)
            return;
        // rekursiver Aufruf:
        increment(value - 1);
    }
}
