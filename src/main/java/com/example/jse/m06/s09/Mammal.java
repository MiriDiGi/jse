package com.example.jse.m06.s09;

public abstract class Mammal {   //se togliamo abstract si può usare
    protected int gestation;       //se è importante che venga acceduto da cane e gatto lo facciamo protrected

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    public void eat() {
        System.out.println("Gnam!");
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
