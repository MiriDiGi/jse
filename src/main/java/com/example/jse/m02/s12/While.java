package com.example.jse.m02.s12;

public class While {
    public static void main(String[] args) {
        int i = 0;                    //inizializziamo variabile FUORI DAL LOOP
        while (i < args.length) {          //finchè i < dalla lunghezza dell'argomento. c'è solo una clausola
            System.out.println("The argument " + i + " is " + args[i]);

            // same as above, more verbosely, see also StringBuilder
//           String s = "The argument ";
//           s = s + i;
//           s = s + " is ";                 possiamo anche evitare lo Stringbuilder
//           s = s + args[i];
//            System.out.println(s);

            i += 1;  //la variabile di loop è l'ultima cosa

            // other ways to increase a number (no side effect here!)
            // i++;
            // ++i;
            // i = i + 1;  modo più lungo di scriverlo
        }

        System.out.println("done!");
    }
}