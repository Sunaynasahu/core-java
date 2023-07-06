package com.rays.ClonnIng;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("raj");
		Customer c2 =(Customer)c1 . clone();
		c2.name ="Neha";
	     c2.acnt.balance = 20;
		 
		
		System.out.println(c1.name);
		System.out.println(c1.acnt.balance);
		System.out.println(c2.name);
		System.out.println(c2.acnt.balance);
		
	}

}
