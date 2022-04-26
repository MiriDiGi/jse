package com.example.jse.m10.s04;

import java.util.Objects;

public class Dog implements Comparable<Dog> {   //voglio avere un cane comparabile perchè compararlo con gli altri cani. il metodo è compareTo <T> dove T sta per generico così che comparable sa che sta comparando il tipo cane
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
    public boolean equals(Object obj) {
        // or use IDE auto-generation tool
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog that = (Dog) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        // consider using an external library for better performance
        // or use IDE auto-generation tool
        // or extract code from Arrays.hashCode()
        return Objects.hash(name, owner);
    }

    @Override
    public String toString() {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }

    @Override
    public int compareTo(Dog that) {               //confronto nome e nome dell'owner
        int cmp = this.name.compareTo(that.name);   //confronto Tom carl con Tom bob, hanno nome uguale quindi torna 0
        if (cmp == 0) {
            return this.owner.compareTo(that.owner);   //dato che i nomi sono uguali fa il confronto sugli owner che essendo diversi torna -1
        }
        return cmp;
    }
}
