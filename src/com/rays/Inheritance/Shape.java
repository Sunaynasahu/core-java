package com.rays.Inheritance;

public class Shape {
	public Shape() {
		
	}
	private String color = null;
	private int borderwidth = 0;
	

	
	public void setColor(String color) {
	this.color = color;
		
	}
	public String getColor() {
		return color;
	}
	
	public void setBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
		
	}
	public int getBorderWidth() {
		return borderwidth;
		
	}

	public void area() {
		System.out.println("shape Area method");
	}
}
