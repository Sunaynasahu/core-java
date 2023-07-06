package com.rays.oop;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Sunayna");
		System.out.println(p.getName());
		
		p.setDateOfBirth("21/06/2023");
		System.out.println(p.getDateOfBirth());
		
		p.setAddress("RRcat near rajendra nagar");
		System.out.println(p.getAddress());
		
		System.out.println(p.getAvgAge());
		

		
	}

}
