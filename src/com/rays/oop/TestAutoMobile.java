package com.rays.oop;

public class TestAutoMobile {
public static void main(String[] args) {
	
	AutoMobile a = new AutoMobile();
	a.setColor("red");
	System.out.println(a.getColor());
	a.setSpeed(80);
	System.out.println(a.getSpeed());
	a.setMake("car");
	System.out.println(a.getMake());
	
	 System.out.println(a.getNoOfGear());

}
}
