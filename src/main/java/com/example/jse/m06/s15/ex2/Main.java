package com.example.jse.m06.s15.ex2;

/**
 * Create a hierarchy of classes based on Person
 * <p>
 * Consultant: daily fee
 * <p>
 * Employee: monthly salary
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of persons
 * <p>
 * Print name and daily / salary accordingly to their actual type
 */
public class Main {
    public static void main(String[] args) {
        Worker[] workers = {new Consultant ("Tom", "Smith", 200), new Employee ("Bob", "Ford", 1000), new Consultant ("Tim", "Red", 150)};

        for (Worker worker : workers) {
        	System.out.println();
        	System.out.println(worker.toString());
            System.out.println(worker.getFirstName() + " " + worker.getLastName() + ": " + worker.monthly());

//         Person[] persons = {new Consultant ("Tom", "Smith", 200), new Employee ("Bob", "Ford", 1000), new Consultant ("Tim", "Red", 150)};
           
//         for (Person person : persons) {
//         System.out.prinln(person);
            
//         if (person instanceof Consultant){           metodo senza creare la classe worker, in questo caso le nostre classi sono estensioni di person
//             Consultant c = (Consultant) person;      va modificato anche l'array con Person[] persons e il for sotto
//	           System.out.println(c.getFee()*20);    

        }
    }
}


