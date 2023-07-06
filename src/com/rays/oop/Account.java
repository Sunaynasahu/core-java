package com.rays.oop;

public class Account {
	private int balance = 0;
	private String accountNumber = null;
	private String accountType = null ;
	
	public void setBalance (int b) {
		balance = b;
		
	}
	public void setAccountNumber(String s) {
		accountNumber = s;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
		
	}
	public void deposite(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		
	}
	public void withdraw(int amount) {
		int total = getBalance() -amount;
		setBalance(total);
		 
	}
	public void setAccountType(String s) {
		accountType = s;
		
	}
	public String getAccountType() {
		return accountType;
	}
	public void fundtransfer(int f) {
		int sub = getBalance()- f;
		setBalance(sub);
		
	}
	public void paybill(int p) {
		int t = getBalance()- p;
		setBalance(t);
		

	}
	
	
	
	
	
	
}

