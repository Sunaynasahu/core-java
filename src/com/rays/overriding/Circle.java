package com.rays.overriding;

public class Circle extends Shape {
	private int radious =0;
	public  static final double PI =3.14 ;
	
	public void setRadious(int radious) {
		this.radious =radious;
		
	}
	public int getRadious() {
		return radious;
	}	
	
	public double getPI() {
		return PI;
		
		
	}
	@Override
	public void area() {
		int i = getRadious();
		double d = getPI();
		System.out.println("Shape Area Radious = " + i);
		System.out.println("Shape Area P = " + d);
	}
	 

}
