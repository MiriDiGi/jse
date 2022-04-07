package com.example.jse.m03.s05;

public class AboutString {

    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));   //seleziono un carattere della stringa

        System.out.println("s < t: " + s.compareTo(t));  //confronto due stringhe, se il risultato è un valore negativo s viene prima e t dopo
        System.out.println("t > s: " + t.compareTo(s)); //se esce un valore positivo vuol dire che t viene dopo di s (alfabetico)

        System.out.println("concat s and t: " + s.concat(t)); //è come fare il "s" + "t"

        System.out.println("t contains u? " + t.contains(u));  //prendi la stringa t e vedi se in ti c'è u 

        String u2 = t.substring(1, 3);                        //serve per creare una sottostringa che in questo caso comincia all'indice uno e finisce all'indice 3
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));   //sosttostringa di t comincia a 3 e finisce alla fine 

        System.out.println("u equals u2? " + u.equals(u2));  //se la sottostringa u2 p uguale a u, questo e quello sotto NON SONO uguali
        System.out.println("u == u2? " + (u == u2));         //se fossero interi tornerebbe true ma la stringa è una reference, guarda cosa c'è nella cella u e u2, il reference è lo stesso? no, è diverso id è 30 e 40 vedi con debug

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));     //ritorna un indice, vede sulla stringa s la posizione della prima l che incontra
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));   //stessa cosa di sopra ma parte dal fondo
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));     //x non c'è, come risolve la cosa? non tira un'eccezione ma questa non è un'eccezione, segnala solo che non l'ho trovato. allora si segue la convenzione, gli indici sono interi (0 o positivi) se non c'è vado in negativo (-1).
        
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));       //questo e il metodo sotto sono diversi,hanno lo stesso nome ma sono diversi perchè hanno parametri diversi. però fanno la stessa cosa
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));    //anche qui ritorna meno uno perchè non esiste questa coppia

        System.out.println("check if an empty string is empty: " + "".isEmpty());  //mi ritorna true se la stringa è vuota esempio sotto nel commento
        // String x = "";         
        // x.isEmpty();

        System.out.println("s length: " + s.length());   //per le stringhe è un metodo, ha le parentesi tonde per le stringhe.

        String s2 = s.replace('l', 'q');       //sostituisco tutte le l con q, se non avessi assegnato tutto ad una nuova variabile essendo una stringa immutabile heqqu sarebbe andata persa
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

//        String[] splits = "one for me, one for you".split(" ");
        String csv = "alpha,beta,gamma,delta";   //csv sono file che appiccicano tutti i dati, per farli leggere a java in maniera sensata li splitto
        String[] splits = csv.split(",");        //dico a java qual è il separatore
        System.out.println("Splitting: ");      //applico il loop e ognuno viene inserito in una array di stringhe
        for (String token : splits) {           //for each
            System.out.println(token);
        }
        String joined = String.join(" ", splits);           //join è un metodo statico, lo capisco perchè a sinistra del punto c'è la classe invece dell'istanza
//        String joined = String.join(",", "a", "b", "c");     //usa il connettore (in questo caso uno spazio bianco) per generare una stringa unica
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase();
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "Shut UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");  //taglia le eccedenze a sinistra e a destra, lascia la la la con gli spazi bianchi interni ma toglie gli estremi

        int a = 42;
        String b = "hello";
        double c = 10 / 3.0;
        System.out.println(String.format("An integer %d, a string %s, and a floating point %.3f", a, b, c));   //% sono un segnaposto d è un numero s stringa e 3f un floating point il 3 sta per 3 cifre dopo la virgola
        System.out.println("An integer " + a + ", a string " + b + ", and a floating point " + c);     //è la stessa cosa di sopra ma sbagliata perchè non posso formattare in modo speciale il floating point, mette troppe cifre

        String x = null;              //se voglio stampare un null uso valueOf() stampa tutto senza crushare
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
    }
}
