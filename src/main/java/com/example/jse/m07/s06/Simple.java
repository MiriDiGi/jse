package com.example.jse.m07.s06;

public class Simple {
    /**
     * Negate the input value
     * 
     * @param value
     * @return the negated input
     * @throws IllegalArgumentException when it is not possible to negate correctly the input value
     */
    public int negate(int value) {          //sembra facile ma ha un lato oscuro, positivi e negativi non sono simmetrici perchè c'è lo 0 che rompe la simmetria,  gli int sono più grandi  di quelli che possono essere contenuti, dovrei usare un long
        if (value == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Can't negate MIN_VALUE");   //non posso quindi tirare l'eccezione
        }
        return -value;
    }

    /**
     * Negate the input value. If not possible, provide a close alternative solution in the exception
     * 
     * @param value
     * @return the negated input, when possible
     * @throws MyNegateException when it is not possible to negate correctly the input value
     */
    public int negateFallback(int value) throws MyNegateException {
        if (value == Integer.MIN_VALUE) {
            throw new MyNegateException(Integer.MAX_VALUE);
        }
        return -value;
    }
}
