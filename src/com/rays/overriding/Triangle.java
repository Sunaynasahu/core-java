package com.rays.overriding;

public class Triangle extends Shape{
	private int height = 0;
	private int weight = 0;
	
	public void setHeight(int height) {
		this.height = height;
		
		
	}
 public int getHeight() {
	return height;
	
}
public void setWeight(int weight) {
	this.weight = weight;
}

public int getWeight() {
	return weight;
	
}
@Override
public void area () {
	int i = getHeight();
	int i1 = getWeight();
	System.out.println("Triangle area Height = " + i);
	System.out.println("Triangle area weight = " + i1);
}

}
