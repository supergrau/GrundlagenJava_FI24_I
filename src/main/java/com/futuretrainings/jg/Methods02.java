package com.futuretrainings.jg;

public class Methods02 {
    public static void main(String[] args) {
        System.out.println("Vor der Linie");
        printLine('✨', 20);
        System.out.println("Nach der Linie");
    }

    static void printLine(char c, int len) {
        switch (c) {
            case ' ', '\t', '\b' -> {
                return;
            }
        }
        for (int i = 0; i < len; i++) {
            printChar(c);
        }
        System.out.println();
    }

    static void printChar(char c) {
        System.out.print(c);
    }
}
