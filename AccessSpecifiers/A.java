package com.tka.client;

public class A {
	
     private int balance= 1000;
     
     public void showBalance()
     {
    	 System.out.println(balance);
     }
	
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
