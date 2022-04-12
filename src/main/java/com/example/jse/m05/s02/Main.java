package com.example.jse.m05.s02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // no dog created here
        Dog[] dogs = new Dog[2];                     //creo un array di cani
        System.out.println(Arrays.toString(dogs));      //crea un oggetto solo, un oggetto array
 
        Dog tom = new Dog();               //creiamo un cane tom accessibile sia via tom che via cella dell'array dogs
        dogs[0] = tom;             //metto tom nella cella dell'array, assegno il refernce di tom alla cella 0
        dogs[1] = new Dog();       //creo direttamente un cane nella cella dell'array
        dogs[0].bark();               //a sinistra del punto specifico su quale cane voglio operare
        dogs[1].bark();
        tom.bark();
    }
}
