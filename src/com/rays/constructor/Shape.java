package com.rays.constructor;

public class Shape {
public Shape() {
	
}
private int Borderwidth =0;
private String color = null;


 public Shape( int Borderwidth ,String color) {
	 this.Borderwidth = Borderwidth;
	 this.color =color;
	 
 }
 public int getBorderWidth() {
	 return Borderwidth;
	 
 }
 public String getColor() {
	 return color;
 }
}
