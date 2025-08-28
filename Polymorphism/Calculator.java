package com.tka.july17;

public class Calculator {
	
	int price;
	String cname;
	
	Calculator()
	{
		System.out.println("Zero parameterized contructor ");
	}
	
	Calculator(int p, String cn)
	{
		System.out.println("Two parameterized contructor ");
		price = p;
		cname = cn;
	}
	
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	float add(float a, float b)
	{
		return a+b;
	}
	
	long add(long a, long b)
	{
		return a+b;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	
}
