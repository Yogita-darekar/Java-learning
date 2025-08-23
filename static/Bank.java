package com.tka.july14;

public class Bank {
	static int balance= 1000;
	
	void withraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient balance");
		}
		else 
		{
			balance -= amount;
			System.out.println("Withdrawal successfully."+balance);
		}
	}

}
