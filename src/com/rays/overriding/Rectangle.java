package com.rays.overriding;

public class Rectangle extends Shape{
	

	
		private int length = 0;
		private int width =0;
		
		
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
   @Override

	  		public void area() {
			int i =getLength( ) * getWidth();
			System.out.println("RectangleArea = " + i);
	  		
		
	  		

	
		
		
		
		
	}
	
	
	}
		
	
		
		





