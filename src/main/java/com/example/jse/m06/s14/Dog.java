package com.example.jse.m06.s14;

public class Dog extends Pet {                           //dog estende pet
    public static final double STANDARD_SPEED = 0.0;

    private final double speed;

    public Dog() {                
        // notice the implicit call to super
        this.speed = STANDARD_SPEED;            //this normale
    }
                                                          //tre costruttori
    public Dog(String name) {
        this(name, STANDARD_SPEED);           //this costruttore: quando qualcuno lo invoca passiamo il controllo ad un altro perchè c'è la parentesi tonda
    }                                        //se l'utente non passa la velocità usa quella standard, sta invocando quello sotto praticamente

    public Dog(String name, double speed) {        
        super(name);
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Dog [speed=" + speed + "] " + super.toString();
    }
}