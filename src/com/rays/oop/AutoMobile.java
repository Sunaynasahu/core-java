package com.rays.oop;

public class AutoMobile {
	private String color =" ";
	private int speed = 0;
	private String make = " ";
	public static final int noofgear = 6;
	
	
	
	public void setColor(String s) {
		color = s;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int d) {
		speed = d;
	}
	public int getSpeed() {
		
		return speed;
		
	}public void setMake(String r) {
		make = r;
		
	}public String getMake() {
		return make;
	}
	
	public int getNoOfGear() {
		return noofgear ;
	}

}
