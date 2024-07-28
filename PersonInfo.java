package com.task2;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		this.name = name;
		
		// Set default age to be 18
		if(age == 0)
			this.age = 18;
	}
	
	public void display() {
		System.out.println(String.format("Person: name=%s, age=%d", name, age));
	}
}

public class PersonInfo {
	public static void main(String[] args) {
		Person p1 = new Person("Ashok");
		Person p2 = new Person("Kiran", 20);
		p1.display();
		p2.display();
	}
}
