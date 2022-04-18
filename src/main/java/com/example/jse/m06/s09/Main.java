package com.example.jse.m06.s09;

public class Main {
    public static void main(String[] args) {                        //array di mammiferi
        Mammal[] mammals = { new Dog(63), new Cat(63, 20) };  //creo un cane e un gatto estendendo la classe mammiferi

        for (Mammal mammal : mammals) {            //per tutti gli elementi in mammiferi prendi to string e fallo su ognuno, poliformismo
            System.out.println(mammal.toString());
        }

        Barker barker = new Dog(62, 42); //creo un cane e mettero il suo reference nella variabile costante interfaccia barker
        barker.bark();                      //posso invocarei l bark perchè il cane è un barker

        Dog dog = new Dog(12, 12);
        System.out.println(dog.toString());
        dog.eat();
    }
}
