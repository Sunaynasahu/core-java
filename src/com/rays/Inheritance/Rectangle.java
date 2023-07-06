package com.rays.Inheritance;

public class Rectangle extends Shape {
	
	public Rectangle () {
		
	}
	private int length =0;
	private int width = 0;
	
	
	public Rectangle(int length ,int width) {  //constructor
		this.length = length;
		this.width = width;
	}
	
	
	public void setLength(int length) {
		this.length =length;
		
	}
public int getLength() {
	return length;
	
}
public void setWidth(int width) {
	this.width = width;
}
public int getWidth() {
	return width;
}
  // public void area() {
	//System.out.println("rectangle Area method");
 //}
	public void area() {
		int i =getLength( ) * getWidth();
		System.out.println("RectangleArea = " + i);
	}
}
