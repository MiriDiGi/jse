package com.example.jse.m08.s05;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {
    public static void main(String[] args) {
        // data factories
        System.out.printf("A date (by 'of' /1): %s%n", LocalDate.of(2022, Month.JANUARY, 30));   //formato giapponese, anno, mese, giorno. month è un enumerator!!
        System.out.printf("A date (by 'of' /2): %s%n", LocalDate.of(2022, 1, 30));         //posso anche usare un intero
        System.out.printf("A date (by 'parse'): %s%n", LocalDate.parse("2022-01-30"));        //in stringa, non c'è new ma static factory method per nascondere il costruttore, perchè è una cosa complicata
 
        LocalDate today = LocalDate.now();
        System.out.printf("Current date (now): %s%n", today);

        // data getter
        System.out.printf("Current date (getter /1): %02d %02d %d%n", today.getDayOfMonth(), today.getMonthValue(),     //accettabile il getter, è impossibile però modificarli non ci sono setter
                today.getYear());
        System.out.printf("Current date (getter /2): %02d %02d %d%n", today.get(ChronoField.DAY_OF_MONTH),   //uso i getter per stamparlo come voglio io
                today.get(ChronoField.MONTH_OF_YEAR), today.get(ChronoField.YEAR));

        // date with
        System.out.printf("Tomorrow (with): %s%n", today.with(ChronoField.DAY_OF_MONTH, today.getDayOfMonth() + 1));
        System.out.printf("Same day, next year (with): %s%n", today.withYear(today.getYear() + 1));

        // date plus / minus
        System.out.printf("Tomorrow (plus): %s%n", today.plus(1, ChronoUnit.DAYS));              //partendo da oggi aggiungi un giorno, dato che è immutabile crea un nuovo oggetto
        System.out.printf("Same day, last year (minus): %s%n", today.minus(1, ChronoUnit.YEARS));  //togli un anno, dato che è immutabile crea un nuovo anno
    }
}
