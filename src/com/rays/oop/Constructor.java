package com.rays.oop;

public class Constructor {
public Constructor() {
	}
private int id = 0;
private String name ;

public Constructor(int id,String name) {
	this.id =id;
	this.name =name;
}
	public void setId(int id) {
		this.id =id;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}