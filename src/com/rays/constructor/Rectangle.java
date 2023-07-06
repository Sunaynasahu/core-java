package com.rays.constructor;

public class Rectangle extends Shape {
	public Rectangle() {
		
	}
	private int length = 0;
	private int width = 0;
	
	
    public Rectangle(int length , int width  ) {
    	super(  30 , "blue"); //second method of using super key
    	
	this.length =length;
	this.width =width;
	
}
    
    
   public Rectangle(int length , int width ,int Borderwidth , String color ) {
//	super(Borderwidth ,color);  //super key will call shape class

	this.length =length;
	this.width =width;
	
 }
     public int getLength() {
	return length;
	
}
	    public int getWidth() {
		return width;
	}
	

}
