package com.example.jse.m05.s08;

public class Square {
	private double side;

	public Square(double side) {
		this.side = side;
	}
	
	public double area() {            //non servono parametri perchè ho già il lato
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
}
