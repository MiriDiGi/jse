package com.example.jse.m06.s09;

public class Cat extends Mammal {       //gatto estende il mammifero e aggiunge il fatto che ha una coda
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
