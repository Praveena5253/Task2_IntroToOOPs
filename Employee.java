package com.task2;

class PersonDetails {
	private String name;
	private int age;
	
	public PersonDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Employee extends PersonDetails {
	
	int empId;
	float salary;

	public Employee(int empId, String name, int age, float salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}
	
	public void displayEmp() {
		System.out.println("Employee Details:");
		System.out.println("-----------------");
		System.out.println("\nEmployee ID: " + empId);
		super.displayPerson();
		System.out.println("Salary: " + salary);
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee(1004, "Ashley", 32, 35000);
		e1.displayEmp();
	}
}
