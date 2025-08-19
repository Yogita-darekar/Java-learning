package com.tka.july7;

public class ArithOp {
	
	void addTwo(int a, int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	
	void subTwo(int a, int b)
	{
		System.out.println("Subtraction = "+(a-b));
	}
	
	void multiplyTwo(int a, int b)
	{
		System.out.println("Multiplication = "+(a*b));
	}
	
	void devideTwo(int a, int b)
	{
		System.out.println("Division = "+(a/b));
	}
	
	void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
