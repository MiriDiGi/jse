package com.example.jse.m08.s05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Data {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();   //creo una variabile euso il factory method
		System.out.println(today);
		System.out.println();
		
		LocalDate birthday = LocalDate.of(1993, Month.DECEMBER, 16);   //posso scrivere anche il numero del mese al posto
		LocalTime myTime = LocalTime.of(2, 45);                       //non usare doppio 00
		LocalDateTime birthTime = LocalDateTime.of(birthday, myTime);  

//      LocalDateTime birthTime = LocalDateTime.of(LocalDate.of(1993, Month.DECEMBER, 16), LocalTime.of(2, 45));      posso abbreviare
		
		LocalDate adua = LocalDate.of(1996, Month.JUNE, 17);
		System.out.println(adua);
		System.out.println(adua.getDayOfWeek());
		System.out.println();
		System.out.println(birthTime);
		System.out.println(birthTime.getDayOfWeek());
	}
}

