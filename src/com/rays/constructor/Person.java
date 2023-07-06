package com.rays.constructor;

public class Person {
	
	public Person () {
		System.out.println("default constructor");
		
	}
	public Person(int id) {
		this();
		System.out.println("one param");
	}
	public Person (int id ,String A) {
		this(id);
		System.out.println("two param");
		
	}
	
}
