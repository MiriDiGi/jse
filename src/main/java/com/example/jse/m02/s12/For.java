package com.example.jse.m02.s12;

public class For {
    public static void main(String[] args) {
        System.out.println("Please, pass a few args");
        for (int i = 0; i < args.length; i++) {    //inizializzo i = 0, loopo fino alla fine di args, incremento di 1 ogni volta
            System.out.print("The argument " + i);

            if (i == 2) {                   //non voglio prendere in considerazione l'args 2 quindi lo skippo
                System.out.println(" is skipped");
                continue;
            }

            System.out.println(" is " + args[i]);    //stampa tutti gli altri argomenti
        }

        System.out.println("done!");
    }
}
