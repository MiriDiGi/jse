package com.example.jse.m01.s06;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;        //definire una variabile booleana o false o true
        System.out.println(flag);

        char c = 's';            //serve per memorizzare un carattere, si delimmita con apice singolo ''
        System.out.println(c);

        byte y = 42;             //posso mettere un valore tra -128 e 127
        System.out.println(y);

        short x = 12_000;        // l'underscore _ viene usato come separatore delle migliaia
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        long z = 100_000_000_000_000_000L;    //devo mettere per forza la L altrimenti lo interpreta come intero
        System.out.println(z);

        float f = 3.12e20F;     //numeri più piccini, li usiamo se è importante risparmiare memoria. devo mettere per forza la F altrimenti pensa che è un double
        System.out.println(f);

        double d = 3.12e200;    //numeri grossi con precisione maggiore. e vuol dire in questo caso 10^200
        System.out.println(d);

        double nan = Double.NaN;                      //NaN = not a number
        double posInf = Double.POSITIVE_INFINITY;    //double possono gestire dei non numeri. qui si parla di infinito.
        double negInf = Double.NEGATIVE_INFINITY;    //qui si parla di infinito negativo

        if (!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");                                               //verificare se un valore è infinito, null, infinito negativo
        }
    }
}
