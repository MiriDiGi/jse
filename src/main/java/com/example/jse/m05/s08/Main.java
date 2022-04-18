package com.example.jse.m05.s08;

public class Main {
 public static void main (String[] args) {
	 Square square = new Square (3.0);
	 
	 System.out.println(square.toString()); //posso non metterci esplicitamente toString
	 
	 System.out.println("Area is: " + square.area());
	 
	 System.out.println("Perimeter is: " + square.perimeter());
	 
	 Circle circle = new Circle (4.0);
	 
	 System.out.println("Area is: " + circle.area());
	 
	 System.out.println("Perimeter is: " + circle.perimeter());
	 
	 double bothAreas = square.area() + circle.area();
	 
	 System.out.println("the two areas is: " + bothAreas);
	 
	 Triangolo triangolo = new Triangolo(3.0, 4.0);
	 
	 System.out.println(triangolo.area());
	 
	 System.out.println(triangolo.perimetro());
 }
}
