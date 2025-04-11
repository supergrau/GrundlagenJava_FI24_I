package com.futuretrainings.jg;

public class Methods01 {
    public static void main(String[] args) {
        Lines.printLines();
    }

}

class Lines {
    // print lines
    public static void printLines() {
        for (int i = 0; i < 10; i++) {
            printChar();
        }
    }

    private static void printChar() {
        System.out.print("➤");
    }

}
