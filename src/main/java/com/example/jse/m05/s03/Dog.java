package com.example.jse.m05.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;
    private String breed;

    public Dog() {
        // "this" property - the current object's one - is initialized with a literal
        this.name = "No name";
        this.breed = "Mixed";
        log.info("A new anonymous dog has been created");
    }
                                                                      //questi 3 sono tutti costruttori che hanno parametri diversi
    public Dog(String name) {
        // "this" name is initialized with the parameter name
        this.name = name;
        this.breed = "Mixed";
        log.info("A new dog named " + name + " has been created");
    }

    public Dog(String name, String breed) {         //questo è un metodo costruttore!
        this.name = name;
        this.breed = breed;
        log.info(String.format("A new dog named %s and breed %s has been created", name, breed));
    }

    public void bark() {
        System.out.println(breed + " " + name + ": woof");        //sa che mi deve richiamare l'ultimo costruttore quello con name e breed
    } 
}
