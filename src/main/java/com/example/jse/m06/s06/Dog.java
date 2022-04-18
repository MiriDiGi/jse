package com.example.jse.m06.s06;

import java.util.Objects;

public class Dog {
    private String name;
    private String owner;

    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
                                           
    @Override
    public boolean equals(Object obj) {        //override dell'equals definito nella classe object
        // or use IDE auto-generation tool
        if (obj == this) {                     //se mi passi il reference allo stesso oggetto èè true che sono uguali
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog that = (Dog) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner);  //fa il confronto tra proprietà
    }

    @Override
    public int hashCode() {
        // consider using an external library for better performance
        // or use IDE auto-generation tool
        // or extract code from Arrays.hashCode()
        return Objects.hash(name, owner);
    }

    @Override                         //annotazione che dice che toString viene da una classe super, ovveride non è obbligatoria, 
    public String toString() {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }
    
                                     //questo è un overload non un override!!! lavora solo sulla classe cane!!!
    public String toString(int i) {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }
}
