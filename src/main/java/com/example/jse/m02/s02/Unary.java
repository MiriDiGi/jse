package com.example.jse.m02.s02;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        int result = value;
        System.out.print("result = value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = ++value;
        // same as:
//      value = value + 1;
//      result = value;
        System.out.print("result = ++value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = --value;
        System.out.print("result = --value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = value++;  //incrementa il value MA nel result tieni il valore che c'era prima.
        // quindi result è 1 ma value è 2
        // same as:
//      result = value;
//      value = value + 1;
        System.out.print("result = value++: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        //stessa cosa valore è decrementato MA il risultato è quello che c'era prima quindi 
        //value 1 result 2
        result = value--;
        System.out.print("result = value--: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = +value;
        System.out.print("result = +value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = -value;
        System.out.print("result = -value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);
    }
}
