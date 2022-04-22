package com.example.jse.m07.s06;

public class MyNegateException extends Exception {    //è checked perchè estende exception
    private static final long serialVersionUID = 1L;
    private final int alternativeValue;

    public MyNegateException(int alternativeValue) {
        this.alternativeValue = alternativeValue;
    }

    public int getAlternativeValue() {
        return alternativeValue;
    }
    
}