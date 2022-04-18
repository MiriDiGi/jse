package com.example.jse.m06.s09;

public class Dog extends Mammal implements Barker, Drinker {  //barker e drinker sono due interfacce
									//tail è un aggregato
    private Tail tail;            //una clase può estendere solo un'altra classe, una sola (Dog può avere una sola classe madre) ma può implementare infinite interfacce
    
    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);      //rimanda alla coda e ci pensa la coda a scodinzolare per i cavoli suoi
    }

    public Dog(int gestationDays) {
        super(gestationDays);
        this.tail = new Tail(12);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }

    public void wag() {   //aggregato lavora per delega, la classe si disinteressa di questa funzionalità e lascia fare alla coda
        tail.wag();
    }

    @Override
    public void bark() {
        System.out.println("Wap!");
    }

    @Override
    public void drink() {
        System.out.println("Sip!");
    }
}
