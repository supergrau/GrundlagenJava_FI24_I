package com.futuretrainings.jg;

public class VariableDeclaration {


    public static void main(String[] args) {
    /*
    byte braucht 1 Byte
    short braucht 2 Byte
    int braucht 4 Byte
    long braucht 8 Byte
     */

        byte b = 20;
        System.out.println("byte b = " + b);

        long l = 1000000000000000000L;
        System.out.println("long l = " + l);

        /*
        float braucht 4 Byte
        double braucht 8 Byte
         */

        float f = 12.356f;
        double d = 234.567;
        System.out.println(d);
        //d = f;
        System.out.printf(" d = %2.3f \t f = %2.3f\n", d, f);

        // Declaration:
        int count;
        int price;
        int quantityPerson;
        quantityPerson = 12;
        count = 34;
        System.out.println(count);
        price = 345;
        quantityPerson = count + price;
        System.out.println(quantityPerson);

        //TODO Continue with Declarations

        String  s1      = "String1",
                str2    = "string2",
                str3    = "string3",
                str4="string4";

        var value1 = "Text";
        var value2 = 1;
        var value3 = 1.2;


    }
}
