package com.example.jse.m05.s07.example;

public class Dog {
    private static int count;      //variabile statica, inizializzata direttamente a 0 da java
                                   //non è molto indicato farlo
    private static int barkCount;    //stessa cosa di sopra dovrei fare = 0 e non lasciarglielo fare
    private int barkCountCurrent;        //data member, quante volte ha abbaiato il cane corrente
    private String name;           //proprietà nome cane

    public Dog(String name) {       //costruttore
        this.name = name;
        this.barkCountCurrent = 0;
        count += 1;
    }

    public Dog(String name, int barkCountCurrent) {
        this.name = name;
        this.barkCountCurrent = barkCountCurrent;
        count += 1;
    }

    void bark() {
        barkCount += 1;           //ogni volta che abbaia il cane aumento il contatore dell'abbaiata generale
        barkCountCurrent += 1;    //aumento anche l'abbaiata del cane corrente
        System.out.println(this.name + " bark! (" + Dog.barkCount + ")");
        if (barkCountCurrent > 1) {                                 //se è un cane che aveva già abbaoatp è prima
            double rate = (double) barkCountCurrent / barkCount;     //rate dell'abbiata
            System.out.println("Bark rate: " + rate);
        }
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }

    public static int getCount() {
        return Dog.count;
    }

    public static int getBarkCount() {
        return Dog.barkCount;
    }

    public int getBarkCountCurrent() {
        return barkCountCurrent;
    }
}
