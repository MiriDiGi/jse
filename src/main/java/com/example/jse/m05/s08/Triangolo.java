package com.example.jse.m05.s08;

public class Triangolo {
	private double lato1;
	private double lato2;
	
	public Triangolo(double lato1, double lato2) {     //costruttore
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	@Override
	public String toString() {
		return "Triangolo [lato1=" + lato1 + ", lato2=" + lato2 + "]";
	}
	
	public double area() {
		return lato1 * lato2 / 2;
	}
	
	public double perimetro() {
		
		double lato1quad = lato1 * lato1;
		double lato2quad = lato2 * lato2;
		double ipoQuad = lato1quad + lato2quad;
		double ipotenusa = Math.sqrt(ipoQuad);     
		return lato1 + lato2 + ipotenusa;
	}
}
