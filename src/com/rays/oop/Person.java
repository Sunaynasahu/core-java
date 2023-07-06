package com.rays.oop;

public class Person {
	private String name = " ";
	private String dateofbirth = "dd/MM/yyyy";
	private String address = " ";
	public static final String avgAge = "22";
	
	
	
	public void setName(String s){
	   name = s;
	}public String getName () {
		return name;
	}
	
	
	public void setDateOfBirth(String d){
	dateofbirth = d;
}public String getDateOfBirth () {
	
	return dateofbirth;
	
}
public void setAddress(String a) {
	address = a;
}public String getAddress() {
	return address;
}
public String getAvgAge() {
	
	return avgAge;
}
	
}


