package com.rays.collection;

import java.util.Comparator;

public class Student implements Comparable <Student>{
	private int id  =0;
	private String name  =null;
	private int salary = 0; 
	
	public Student(int id, String name, int salary){
		this.id = id;
		this.name =name;
		this.salary =salary;
	}
	public int getId() {
		return id;
		
	}public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
		
		
	
	@Override
	public String toString() {
	
		return (" ( "+id + "  "  +  name +" " + salary + " )");
	}
	@Override
	public int compareTo(Student o) {
		
		return this.id -o.id;
		
	}
	class OrderById implements Comparator<Student>{
	@Override
		public int compare(Student o1, Student o2) {
			return o1.getId()-o2.getId();
		} 
	}
	class OrderByName implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		} 
	}
}
