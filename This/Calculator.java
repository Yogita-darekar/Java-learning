package com.tka.july23;

public class Calculator {
	
	int p = 10;  //instance variable
	int roll;
	String name;
	int marks;
	
	Calculator()
	{
		System.out.println("Zero parameter constructor.");
	}
	
	Calculator(int r)
	{
		this();  //constructor call
		roll =r;
		System.out.println("one parameter constructor.");
	}
	
	Calculator(int r, String n)
	{
		this(r);
		name = n;
		System.out.println("two parameter constructor.");
	}
	
	Calculator(int r, String n, int m)
	{
		this(r,n);
		marks = m;
		System.out.println("three parameter constructor.");
	}
	
	void m1()
	{
		System.out.println(p);
		
	}
	
	void m2()
	{
		this.m1();  //method call
		int p = 20;
		System.out.println(p);
		System.out.println(this.p);  //variable call
		System.out.println(this);
	}

}
