package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		 a.setBalance(3000);
		 System.out.println(a.getBalance());

		 a.deposite(2000);
		 System.out.println(a.getBalance());

		 a.withdraw(500);
		 System.out.println(a.getBalance());

		 a.setAccountNumber("wrt24368yd");
		 System.out.println(a.getAccountNumber());

		 
		 
		 a.setAccountType("saving Ac");
		 System.out.println(a.getAccountType());

		 a.fundtransfer(1500);
		 System.out.println(a.getBalance());


		 a.paybill(500);
		 System.out.println(a.getBalance());
		
	}

}
