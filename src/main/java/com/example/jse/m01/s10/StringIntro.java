package com.example.jse.m01.s10;

public class StringIntro {
    public static void main(String[] args) {
        // a single character
        char c = 'x';
        System.out.println(c);

        // Create a String explicitly, !!! _not_ a good idea !!!
        String s = new String("Hello");
        System.out.println(s);

        // Implicit call to "new" for a String
        String t = "Hello";
        System.out.println(t);

        // Create a mutable string, and then change it
        StringBuilder sb = new StringBuilder("Hello");
        sb.deleteCharAt(4);     //essendo modificabile abbiamo cancellato il 4 carattere, ovvero la 0
        sb.append(", Tom!");    //aggiunge elementi alla stringa
        
        // Create a String from a StringBuilder
        String u = sb.toString();
        System.out.println(u);

        // Text block //possiamo andare a capo con le stringhe, cosa che non si può fare con quelle normali.
        //possiamo mettere "tom" direttamente dentro il testo, nella stringa normale non si può fare
        //per farlo nella stringa normale "Hello, \"Tom\""; 
        String text = """   
                Non impedir lo suo fatale andare:
                vuolsi così colà dove si puote
                ciò che si vuole, e più non dimandare
                """;
        System.out.println(text);
    }
}
