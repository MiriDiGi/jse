package com.example.jse.m05.s08;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return radius * radius *Math.PI;
	}
	
	public double perimeter() {
		return 2 * radius * radius *Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
