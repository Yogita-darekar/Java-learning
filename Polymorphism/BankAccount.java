package com.tka.july17;

public class BankAccount {
	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0)
		{
			this.balance = balance;	
			System.out.println("Balance = "+balance);
		}
	}
	
	void deposit(double amount)
	{
		if(amount>0) {
			balance += amount;
			System.out.println("Balance = "+balance);
		}
	}
	
	void deposit(double amount,String mode)
	{
		if(amount>0)
		{
			balance += amount;
			System.out.println("Mode : "+mode);
			System.out.println("Balance = "+balance);
		}
	}
	
	void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal successfully.");
		}
		
	}
	
	void withdraw(double amount, String atmLocation)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal successfully in "+atmLocation);
		}
	}
	

}
