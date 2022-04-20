package com.example.jse.m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = {new Warrior("Tom", 6), new Warrior("Bob", 8), new Wizard("Silente", 9), new Wizard("Harry", 8) };

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println("Let's fight ...");
        for (int i = 0; i < actors.length; i++) {               
            System.out.println("Actor: " + actors[i]);
            
            
            for (int j = 0; j < actors.length; j++) {                       //facciamo un for nel for per far combattere tutti
            	if (i != j && actors[i].isAlive() && actors[j].isAlive()) {     //combattono persone diverse solo se sono vive
            		if (actors[i].fight(actors[j])) {
            			actors[j].kill();
            		} else {
            			actors[i].kill();
            		}
            	}
            }
        }
        for (int i = 0; i < actors.length; i++) {               
            System.out.println("Actor: " + actors[i]);
        }
    }
}
