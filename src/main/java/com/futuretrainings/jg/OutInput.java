package com.futuretrainings.jg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OutInput {
    public static void main(String[] args) throws IOException {
        // Unterschiedliche Ausgaben:
        System.out.println("Output on standard-out");
        System.err.println("Output on standard-error");

        Scanner scanner = new Scanner( System.in );
        // Console-Inputs
        System.out.print("\nInput: ");
        String name = scanner.nextLine();

        System.out.println(name);


        System.out.print("\nCounter: ");
        Integer counter = scanner.nextInt();

        System.out.println(counter);


        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Input with BufferedReader: ");
        String strInput = null;
        try {
            strInput = input.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(strInput);

        System.out.print("Integer-Input: ");

        int intInput = 0;
        try {

            intInput = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println();
            System.out.println(e.getMessage());
        }
        System.out.println(intInput);

        scanner.close();
    }
}
