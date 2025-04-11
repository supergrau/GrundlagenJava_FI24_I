package com.futuretrainings.jg;

public class Methods04 {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(random(100));
        System.out.println(random(100, 1000));
    }

    static Double random() {
        return Math.random();
    }

    static Double random(int max) {
        return Math.random() * max;
    }

    // überladene Methode
    static Double random(int min, int max) {
        return Math.random() * (max - min);
    }
}
