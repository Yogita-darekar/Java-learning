package com.tka.july17;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b1.setAccountNumber("412643745634");
		b1.setAccountHolderName("Yogita");
		b1.setBalance(10000);
		
		
		b1.deposit(2000.5);
		b1.deposit(5000.3,"online");
		
		b1.withdraw(7000);
		b1.withdraw(9000,"pune");
	    
	}

}
