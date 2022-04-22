package com.example.jse.m09.s08;

import java.util.Scanner;
import java.util.logging.Logger;

public class Adder {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0.0;

        Scanner scanner = new Scanner(System.in);     //creo oggetto scanner, a scanner passo l'argomento System.in modo in cui java mi definisce lo standard input tastiera.
        while (scanner.hasNext()) {                  //hasNext metodo booleano che ritorna true ogni volta input da invio
            if (scanner.hasNextDouble()) {          //mi chiedo se nello scanner c'è un double
                result += scanner.nextDouble();          //vedo quello che c'è a destra dell'operatore, nextDouble (dammi il double che c'è dentro
                log.info("Current result is " + result);      //aggiungo scanner al risultato e 
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }
        }
        scanner.close();                             //ctrl z nel terminale è il modo in cui gli indico che è finito
        System.out.println("Total is " + result);
    }
}
