package com.example.jse.m06.s15.ex2;

public class Employee extends Worker{
	
	private int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [" + getFirstName() + " " + getLastName() + ", salary= " + salary + "]";
	}

	@Override
	public int monthly() {
		return salary;
	}


}
