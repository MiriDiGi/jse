package com.example.jse.m01.s07;

public class Widening {
    public static void main(String[] args) {
        byte aByte = 42;
        short aShort = aByte;
        int anInt = aShort;
        long aLong = anInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        System.out.println(aDouble);

        char aChar = (char) aShort;  //carattere ASCII che ha codifica 42 è un asterisco quindi me lo fa vedere come asterisco perchè char è un carattere non un numero
        int anotherInt = aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherInt);

        char asterisk = '*';
        int asterAsInt = asterisk;
        System.out.print(asterisk);
        System.out.print(" <-> ");
        System.out.println(asterAsInt);

        // widening a negative value works as expected     modo in cui vengono memorizzati i negativi = complemento a 1 si alza tutto a 1
        // [11111111] -> -1
        // [11111111][11111111][11111111][11111111] -> -1
        // this would be a mistake: [00000000][00000000][00000000][11111111] -> 255
        byte minusOne8Bit = -1;
        int minusOne32Bit = minusOne8Bit;
        System.out.print(minusOne8Bit);
        System.out.print(" [byte -> int] ");
        System.out.println(minusOne32Bit);

        long aBigLongValue = 1_000_000_000_000_000_000L;    //conversione da long a float, non viene bene per problemi di arrotondamento che non si ha con i double
        float aFloatApproximation = aBigLongValue;
        double aDoubleConversion = aBigLongValue;
        System.out.print(aBigLongValue);
        System.out.print(" [long -> float] ");
        System.out.print(aFloatApproximation);
        System.out.print(" [long -> double] ");
        System.out.println(aDoubleConversion);

        System.out.println(String.format("Float: %.0f, double: %.0f", aFloatApproximation, aDoubleConversion));
    }
}
