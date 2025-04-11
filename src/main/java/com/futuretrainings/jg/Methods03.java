package com.futuretrainings.jg;

public class Methods03 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(random(100));
        System.out.println(getMessage());
    }

    static Double random(int factor) {
        return Math.random() * factor;
    }

    public static String getMessage() {
        return "Meine Klasse: " + random(50).toString();
    }
}
