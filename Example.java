package com.multithreading;

class User {
	int id;
	String name;
	
	public User(int id, String name)  // Parameterized constructor
	{
		this.id = id;
		this.name = name;
	}

}

class Employee extends User 
{
	double sallary;
	public Employee(int id, String name, double sallary) {
		super(id, name);
		this.sallary=sallary;
		System.out.println("Salary: "+sallary);

	}

	public double calculateAnnualSalary() { //method 
	     return sallary*12;
	}
}

public class Example{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(1, "ABC", 5000); //object of Employee

		double annualSalary = emp.calculateAnnualSalary();
		System.out.println("Annual Salary: " + annualSalary);
	}
}
