package com.example.jse.m03.s02;

public class Simple {
    static String aStaticMethod() {   //metodo statico, non ha bisogno di un oggetto
        return "Hi";
    }

    int anInstanceMethod(int a, int b) {    //metodi d'istanza, java è un linguaggio fortemente tipizzato ed è ben definita
        return a * b;                       //metodi d'istanza non hanno lo static davanti
    }

    void anotherInstanceMethod(boolean flag) {      //dovrò passargli un booleano
        if (flag) {                              // if (flags) è equivalente a dire  if (flags == true) 
            System.out.println("Hello");
        } else {                                  //questo metodo non ritorna niente perchè è void, ritorna solo il controllo
            System.out.println("Goodbye");
        }
    }
    void servoAQualcosa () {
    	//metodo che non fa niente e non ritorna niente, solitamente è un segnaposto
    	// gli diamo un nome ma lo lasciamo vuoto per riempirlo poi
    }
}