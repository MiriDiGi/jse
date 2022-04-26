package com.example.jse.m10.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AsCollection {
    public static void main(String[] args) {
        // concrete types could be _any_ Collection
        Collection<Integer> collOne = create(true);   //ho creato una collezione vuota
        Collection<Integer> collTwo = create(true, 12, 18, -5, -2233);

        collOne.addAll(collTwo);   //aggiungo elementi alla collezione, quello che mi interessa è che sia una collezione di interi. addAll() prendi tutti gli elementi che sono il collTwo e mettimeli in collOne
        // implicit call to the overridden toString() for the variable actual type
        System.out.println("Working with this collection: " + collOne);

        if (collOne.contains(-2233)) {             //collOne contiene il valore -2233
            System.out.println("-2233 is there");
        }

        if (collOne.equals(collTwo)) {     //confronta il tipo, poi quanti valori contiene, poi i valori
            System.out.println("Collections of the same concrete type and with the same (equals) elements");
        }

        collOne.add(42);    //aggiungo un elemento, dove lo mette dipende dal tipo di collezione, se fosse un arrayList lo metterebbe infondo dato che è in hash lo mette a caso
        if (!collOne.equals(collTwo)) {
            System.out.println("The collections are not equals");
        }

        System.out.print("This collection has " + collOne.size() + " elements: ");
        Iterator<Integer> it = collOne.iterator();     //looppo in un altro modo su tutti
        while (it.hasNext()) {
            Integer current = it.next();
            System.out.print(current + " ");

            // same, one-liner
//            System.out.print(it.next() + " ");
        }
        System.out.println();

        // for-each hides the iterator
        System.out.print("Again: ");
        for(Integer current: collOne) {
            System.out.print(current + " ");
        }
        System.out.println();

        if (collOne.remove(-5)) {
            System.out.println("Element -5 removed");
        }

        System.out.print("Converting a collection to an array: ");
        Integer[] values = new Integer[collOne.size()];   //convertire una collezione in array uso il metodo tu Array
        values = collOne.toArray(values);    //scritto in maniera compatta

        // same, one-liner
//        Integer[] values = collOne.toArray(new Integer[collOne.size()]);
        System.out.println(Arrays.toString(values));

        collOne.removeIf(x -> x > 20);       //programmazione funzionale, è una lambda. rimuovi i valori che hanno un valore maggiore di venti, rimuovi se. looppa e rimuove. freccina funzione, la prima x è il parametro d'ingresso.
// possiamo scrivere    ((Integer x) -> {
//                       return  x > 20 });
        System.out.println("After removing values over 20: " + collOne);

        collOne.clear();    //elimina tutto
        System.out.println("After clear(), a collection is empty? " + collOne.isEmpty());    //chiedo se è vuota
    }

    public static Collection<Integer> create(boolean flag, Integer... values) {
        List<Integer> input = List.of(values);
        return flag ? new HashSet<>(input) : new ArrayList<>(input);
    }
}
