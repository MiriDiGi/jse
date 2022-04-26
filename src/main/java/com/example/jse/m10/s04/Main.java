package com.example.jse.m10.s04;

public class Main {
    public static void main(String[] args) {
        Dog tomBob = new Dog("tom", "bob");
        Dog tomCarl = new Dog("tom", "carl");
        if (tomBob.compareTo(tomCarl) < 0) {    //siccome il risultato è -1 perchè bob arriba prima di carl
            System.out.println("Tom-Bob is before Tom-Carl");
        }
    }
}
