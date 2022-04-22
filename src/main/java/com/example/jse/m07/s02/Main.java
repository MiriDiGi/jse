package com.example.jse.m07.s02;

public class Main {
    public static void main(String[] args) {
        // the caller should check the return value to ensure it is "good"
        double result = noExceptionSquareRoot(-7);  //vuole fare la radice quadrata di un numero negativo, che non si fa quindi non un'eccezione ma fa come sotto
        if (result == -1) {                           //se il valore che torna dal metodo è -1 segnala che qualcosa è andato storto
            System.out.println("...!!!");
        }

        /*
         * ... but what if there is no check?
         */

        System.out.println("result is " + result);

        // in case of exception, if the caller do not take any further step, the program terminates!
        try {                                //prova a gestire l'eccezione
            result = squareRoot(-7);
        } catch (Exception ex) {            //gestisci l'eccezione nel blocco che specifico qui
            // maybe there is a possible alternative approach
//            System.out.println("... !!! I use instead 5");
//            result = 5;

            // maybe I could just tell the user why I can't go on with the program
            System.out.println("Bad input!");       //dico che mi ha dato qualcosa di inaccettabile
            throw new IllegalStateException(ex);    //tiro un'altro throw e siccome nessuna la gestisce termino il programma, nel log vedo il motivo per cui è terminato
        }

        // exceptions are expensive, also in Java they are not always used
//        if (Double.isNaN(result)) {
//            System.out.println("...!!!");
//        }

        try {
            int x = f(3, 0);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("... " + e.getMessage());
        }

    }

    private static double squareRoot(int value) throws Exception {                //throw interrompe la normale esecuzione del programma, va gestita l'eccezione
        if (value < 0) {
            throw new Exception("Bad input, negative values are not accepted");
        }
        return Math.sqrt(value);
    }

    /**
     * 
     * @param value
     * @return -1 if something went wrong
     */
    private static double noExceptionSquareRoot(int value) {  //torna - 1 invece di tirare l'eccezione
        if (value < 0) {
            return -1;
        }

        return Math.sqrt(value);
    }

    /**
     * ArithmeticException!
     */
    static int f(int a, int b) throws Exception {
        if (a > b) {
            throw new Exception("Bad values");
        }

        return a + b;
    }
}
