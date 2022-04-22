package com.example.jse.m07.s03;

public class Exceptional {
    public void aCheckedThrower() throws Exception {   //sono obbligata a scrivere throws dopo perchè è checked. tiriamo eccezioni perchè non sappiamo che fare
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    public void anUncheckedThrower() {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    public void anotherUncheckedThrower() throws IllegalStateException {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    private boolean somethingUnexpected() {
        return true;
    }
}
