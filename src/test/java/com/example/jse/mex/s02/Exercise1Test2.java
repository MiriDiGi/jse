package com.example.jse.mex.s02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise1Test2 {

	@Test
	void testSpeed() {
		double actual = Exercise1.speed(100, 10);       //scriviamo cosa passiamo
		double expected = 10;                          //scriviamo cosa ci aspettiamo
		assertEquals(expected, actual);                //scriviamo che deve fare
	}

}
