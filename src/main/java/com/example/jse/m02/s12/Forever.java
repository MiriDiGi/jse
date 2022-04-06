package com.example.jse.m02.s12;

public class Forever {
    public static void main(String[] args) {
        boolean hasArguments = args.length != 0; //se lunghezza != (diversa) da 0 è true

        // same as: while (true)
        for (;;) {
            System.out.println("Pass an argument to loop forever");

            if (!hasArguments) {     // ! è un not
                break;
            }
        }

        System.out.println("bye");
    }
}
