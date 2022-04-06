package com.example.jse.m02.s12;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three", "four", "five" };
        // ...

        // for-each helps readability
        for (String number : numbers) {
            System.out.println(number);
        }
                                                        //questi primi due sono IDENTICI solo che il primo è un for each
        // we really don't care about "i" here
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // beware of how for-each works on primitives
        int[] ai = { 1, 2, 3, 4, 5 };
        for (int cur : ai) {                //con i primitivi mi mette una copia del valore, se io modifico cur NON MODIFICO L'ARRAYS MA LA SUA COPIA!!!! CUR!!!!
            cur += 1;
            System.out.println(cur);
        }
        System.out.println(Arrays.toString(ai));

        // beware of how for-each works on immutable references
        for (String number : numbers) {
            number += 3;
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numbers));

        // classic for is what we need in this case
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += i;                          //questo crea una nuova stringa, lavoro sulla nuova stringa.
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
