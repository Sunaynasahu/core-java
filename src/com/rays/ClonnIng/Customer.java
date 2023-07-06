package com.rays.ClonnIng;

public class Customer implements Cloneable{
	 String name =null;
     	Account acnt = null;
	
	public Customer(String name) {
		this.name = name;
		this.acnt =new Account (10);
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer c = ( Customer) super.clone();
		c.acnt = (Account)acnt.clone();
		return c;
	}

	}



