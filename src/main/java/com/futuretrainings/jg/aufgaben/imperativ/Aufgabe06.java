package com.futuretrainings.jg.aufgaben.imperativ;

public class Aufgabe06 {
    public static void main(String[] args) {
        stairWayToHeaven(10, 3);
    }

    static void  stairWayToHeaven(int steps, int width) {

        for (int i = 1; i <= steps; i++) {
            int blanks = (steps - i) * width;
            int stars = (i) * width;

            for (int j = 0; j < blanks; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
