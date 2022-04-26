package com.example.jse.m10.s08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsList {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        // no assumption here on the actual concrete type
        List<Integer> list = create(false, 12, 18, -5, -2233);
        System.out.println("Values in list: " + list);

        System.out.println("At index 2: " + list.get(2)); // if it was an array: list[2];   torna elemento in posizione 2

        list.add(997);    //la lista lavora aggiungendo in ultima posizione

        int value = -997;
        int pos = 2;
        list.add(pos, value);      //aggiungo in posizione 2 l'elemento -997
        System.out.println(String.format("After adding at position %d element %d: %s", pos, value, list));
        System.out.println(String.format("Index of %d: %d", value, list.indexOf(-997)));

        try {
            int badPos = 100;
            list.add(badPos, value);
        } catch (Exception ex) {           //provo ad aggiungere in posizione 100 ma non esiste, catch l'eccezioni
            log.log(Level.SEVERE, "Careful with indices!", ex);   //loggo e proseguo, non termina il programma
        }

        list.add(list.size(), 10_008);
        list.add(10_009);
        System.out.println("No \"holes\" in a collection: " + list);   //non possono esserci buchi

        pos = 3;
        value = list.remove(pos);
        System.out.println(String.format("Removing at position %d element %d: %s", pos, value, list));

        value = 42;
        int old = list.set(pos, value); // if it was an array: list[pos] = value;
        System.out.println(String.format("Set at position %d element %d, was %d: %s", pos, value, old, list));

        list.replaceAll(x -> x + 1);    //per ogni valore torna x + 1
        System.out.println("Increasing all elements by 1: " + list);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current < 0) {
                it.set(-current);   //se trovi un numero negativo tornalo positivo
            }
        }
        System.out.println("Traverse and modify a list by list iterator: " + list);
    }

    public static List<Integer> create(boolean asArray, Integer... values) {
        List<Integer> input = List.of(values);
        return asArray ? new ArrayList<>(input) : new LinkedList<>(input);
    }
}
