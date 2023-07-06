package com.rays.Inheritance;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColor("black");
		c.setBorderWidth(10);
		c.setRadious(4);
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadious());
		System.out.println(c.getPI());
				
	Shape s = new Shape();
	Shape s1 = new Circle();
	Circle cir = (Circle)s1;
	s1.area();
	}

}
