package com.example.jse.m03.s03;

public class Main {

    public static void main(String[] args) {
        ParameterPassing pp = new ParameterPassing();  //ho creato un'oggetto di un'altra classe con metodi d'istanza
                              //questo sopra è il reference di paramiterpassing

        int aPrimitiveValue = 12;             //argomento passato al metodo
        System.out.println("A primitive value has been initialized to " + aPrimitiveValue);
        pp.primitive(aPrimitiveValue);  //invoco metodo primitive su oggetto paramiter passing, legge il valore e lo assegna al parametro
        System.out.println("Primitive value is still " + aPrimitiveValue);

        String aString = "Hi";
        System.out.println("A string (immutable reference) has been initialized to " + aString);       //stringa immutabile agisce come un primitivo
        pp.immutableReference(aString);
        System.out.println("String is still " + aString);

        StringBuilder aReferenceValue = new StringBuilder("Hi");                             //essendo lo stringbuilder una stringa mutabile vediamo come agiscono normalmente i reference
        System.out.println("A reference value has been initialized to " + aReferenceValue);
        pp.reference(aReferenceValue);
        System.out.println("referenceValue now is " + aReferenceValue);

        int[] anArray = { 42 };
        System.out.println("An array contains " + anArray[0]);   //è un reference mutabile, funziona come lo stringbuilder
        pp.reference(anArray);
        System.out.println("Now the array contains " + anArray[0]);

        int other = 12;
        System.out.print("Another primitive was " + other); //se voglio cambiare il valore devo dirglielo esplicitamente in questo modo
        other = pp.increase(other);                         //altrimenti non c'è modo, non ha effetto sul primitivo
        System.out.println(" now it is " + other);
    }
}
