package com.example.jse.m01.s07.bugs;

public class Overflow {                       //mon va perchè la somma deve stare dentro i bit altrimenti non esce corretto
    public static void main(String[] args) {
        int bob = 1_000_000_001;
        int tom = 1_000_000_002;
        int kim = 1_000_000_003;
        int jon = 1_000_000_004;

        int total = bob + tom + kim + jon; //la soluzione corretta sarebbe long total = (long)bob + tom + kim + jon;

        System.out.printf("%d + %d + %d + %d = %d", bob, tom, kim, jon, total);
    }
}
