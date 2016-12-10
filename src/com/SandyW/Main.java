package com.SandyW;

public class Main {

    public static void main(String[] args) {

        //WIDTH of int = 32 (4 bytes)
        //int does not give any remainder
        int myIntValue = 5 / 2;

        //WIDTH of float = 32 (4 bytes)
        //float is single precision
        //*** it is good practice to put 'f' after the number for a float for a whole number
        //*** ... the 'f' is required if using a decimal value (otherwise Java assumes it is a double
        float myFloatValue = 5f / 3f;

        //WIDTH of double = 64 (8 bytes)
        //double is double precision
        //double has twice as much data as the float
        //double is the RECOMMENDED:  it is faster, many in-built Java functions use double, it is more precise
        //*** if the double is a whole number, put a 'd' behind the number
        //*** ...otherwise... if the double is a decimal number, the 'd' is not necessary
        //*** because Java automatically assumes it is a double
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);



        /* *******************************************************************************
        * ***CHALLENGE***
        - Convert a given number of pounds to kilograms -
        1.  Create a variable to store the number of pounds
        2.  Calculate the number of Kilograms for the number above and store in a variable
        3.  Print out the result
        NOTES:  1 pound is equal to 0.45359237 kilograms
        ******************************************************************************** */

        double pounds = 200d;
        double conversion = pounds * 0.45359237d;

        System.out.println();
        System.out.println(pounds + " pounds converted to kilograms = " + conversion);

        // ********************************************************************************
        // Remember that underscores '_' may be used to separate numbers to make them easier to read
        double pi = 3.141_592_7d;
        System.out.println("pi = " + pi);
        // ********************************************************************************

        System.out.println();
        System.out.println("This is my first GitHub program... Yippie!!");
    }
}
