package com.example.jse.m02.s07;

public class If {
    public static void main(String[] args) {
        // condition is true when no argument is passed
        if (args.length == 0) {
            System.out.println("You didn't pass me any argument!");  //questa stringa non viene stampata se passo un argomento (se vado in run configuratione passo un argomento lui non stampa questa riga)
        }

        // always executed
        System.out.println("Bye");
    }
}
