
package com.rays.overriding;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		
		Rectangle r = (Rectangle)s[0];
		r.setLength(10);
		r.setWidth(20);
		
		Circle c = (Circle) s[1];
		c.setRadious(3);
		
		Triangle t = ( Triangle)s[2];
		t.setHeight(20);
		t.setWeight(30);
		
		 for (int i =0 ; i<s.length ; i++) {
			 s[i].area();
		 }
		
		
	}

}
