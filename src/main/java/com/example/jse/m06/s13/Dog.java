package com.example.jse.m06.s13;   //this e super come proprietà

public class Dog extends Animal{
	private String name;
	
	public Dog(String name) {
		this.name = name;            //se dico this guardo l'oggetto come reference di Dog
	}

	@Override
	public String toString() {                                    //vorrei richiamare il to string di animal uso super
		return super.toString() + "Dog [name=" + name + "]";      //con super guardo l'oggetto come se fosse il reference della classe Animal
	}
  
}
