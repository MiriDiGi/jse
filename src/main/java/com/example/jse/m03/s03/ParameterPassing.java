package com.example.jse.m03.s03;

public class ParameterPassing {       //richiamo la classe
    /**
     * No side effect
     * 
     * @param parameter being a primitive, it is just a local copy
     */
    public void primitive(int parameter) {       //tiene il 12 ma quando finisce questo metodo muore. ecco qui il parametro a qui è assegnato 12
        parameter += 1;
        System.out.println("parameter is " + parameter);
    }                                                       //il metodo muore qui e da qui in poi il 13 non esiste più
 
    /**
     * No side effect
     * 
     * @param parameter an immutable
     */
    public void immutableReference(String parameter) {
        if (parameter == null) {       //controlliamo se i parametri sono buoni, magari l'utente mi ha passato qualcosa di inaccettabile
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
//        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter));
        parameter += " there";     //dato che mi concatena due stringhe e la stringa è immutabile me ne crea una nuova
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Side effect
     * 
     * @param parameter a reference, the referred object could be changed
     */
    public void reference(StringBuilder parameter) {
        if (parameter == null) {                         //DA FARE OGNI VOLTA CHE IL PARAMETRO è UN REFERENCE
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
        // Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there");                              //lavoro davvero sullo stringbuilder non sulla sua copia
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Array is a reference
     * 
     * @param data an array, its values could be changed
     */
    public void reference(int[] data) {
        if (data == null || data.length == 0) {     //blocco eseguito solo se passa null o array vuoto
            System.out.println("Nothing to do here");
            return;
        }

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    /**
     * Get a primitive, modify the local copy and return it
     * 
     * @param value a primitive, local copy
     * @return the increased value
     */
    public int increase(int value) {   //increase solo il parametro, non incrementa l'argomento
        return value + 1;
    }
}
