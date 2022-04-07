package com.example.jse.m03.s02;

public class Main {
    public static void main(String[] args) {
        // calling a static method
        double root = Math.sqrt(121.0);           //metodo sqrt (square root) ha metodi matematici per fare radice quadrata
                                                  //serve usare un double altrimenti casta
        // calling an instance method
        System.out.println(root);             //gli passa alla println la radice quadrada, quando invochiamo la println il metodo si ferma per printare
                                                   //println non ritorna niente, stampa solo sulla console
        
        String aString = Simple.aStaticMethod(); //per richiamare un metodo statico serve la classe e il nome del metodo
        System.out.println(aString);             //il metodo aStaticMethod è nel file simple.java di questa slide

        Simple reference = new Simple();

        int result = reference.anInstanceMethod(7, 6);   //dato che ho il reference posso andare a utilizzare due metodi non statici
        System.out.println(result);                      //passo come argomenti 7 e 6

        reference.anotherInstanceMethod(true);        //gli passo un booleano perchè si aspetta un booleano
        reference.anotherInstanceMethod(false);
    }                                                   //il metodo main ritorna alla java virtural machine. vuol dire che il programma è finito
}
