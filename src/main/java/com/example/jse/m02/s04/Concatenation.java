package com.example.jse.m02.s04;

public class Concatenation {
    public static void main(String[] args) {
        // add
        System.out.print("5 + 7: ");
        System.out.println(5 + 7); // 12

        // cast to string and concatenate
        System.out.print("5 + \"7\": "); //prima si scriveva così
        System.out.print("""
        		5 + "7":"""); //così fa schifo
        
        System.out.println(5 + "7"); // 57 perchè concatena le stringhe convertendo il 5 in una stringa

        // add, cast to string and concatenate
        System.out.print("5 + 7 + \"4\": ");
        System.out.println(5 + 7 + "4"); // -> 124 somma 5+7 poi converte il risultato in stringa e lo concatena con 4

        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        // "multiply" a string
        System.out.print("Repeat \"Vogons\" three times: ");
        System.out.println("Vogons".repeat(3)); // Java 11

        String s = "Hello";
        // both t and s refer to the same object
        String t = s; //t e s qui si riferiscono entrambi ad Hello

        // reference to a different object created by concatenation
        s += 3; //ad s mi concatena 3, non mi somma 3 volte la stringa, crea una nuova stringa con l'oggetto s Hello3
        //prima s e t avevano lo stesso reference, ora invece s si riferisce a Hello3 e t a Hello e basta

        System.out.print("+= on a string generate a new object: ");
        System.out.println(s);

        System.out.print("We could still have access to the original string: ");
        System.out.println(t);
    }
}
