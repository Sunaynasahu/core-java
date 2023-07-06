package com.rays.collection;

public class Employee implements Comparable <Employee> {
	private int id  =0;
	private String name  =null;
	private int salary = 0; 
	
	public Employee(int id, String name, int salary){
		this.id = id;
		this.name =name;
		this.salary =salary;
		
		
	}
	@Override
	public String toString() {
	
		return (" ( "+id + "  "  +  name +" " + salary + " )");
	}

//	@Override
//	public int compareTo(Employee o) {
//	
//		return this.id -o.id;  
	                                 //OR..
	// return this.salary -o.salary;//
//	}
	
//	@Override
//	public int compareTo(Employee o) {
	
//		return this.name.compareTo(o.name);
//	}	
	@Override
	public int compareTo(Employee o) {
		
			if( this.id -o.id==0) {
				
				return this.name.compareTo(o.name);
			}
			return this.id -o.id;  
}
}