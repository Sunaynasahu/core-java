package com.rays.collection;

public class Person {
	private int id = 0;
	private  String name = null;
	
	public Person(int id, String name) {
		this.id =id;
		this.name = name;
		
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
		
	}
	@Override
	public String toString() {
		
		return (" ( "+id + "  "  +  name +" )");
	}
	

}
