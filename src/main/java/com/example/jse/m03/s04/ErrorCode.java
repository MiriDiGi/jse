package com.example.jse.m03.s04;

public class ErrorCode {
    public static void main(String[] args) {
        // Bad argument
        double argument = -1.0;
        double radix = Math.sqrt(argument);        //non posso fare radici quadrate di numeri negativi, tiro un null invece di un'eccezione 

        // Here the coder does not check the return value before using it!
        System.out.println("Square root is " + radix);

        // Check the return value before using it!
        if (Double.isNaN(radix)) {                   //se not a number è un numero negativo
            System.out.println("Can't calculate the square root of " + argument);
        } else {
            System.out.println("Square root is " + radix);
        }
    }
}
