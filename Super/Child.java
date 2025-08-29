package com.tka.july24;

public class Child extends Parent{
	
	int p = 80;

	void m1()
	{
		int p = 60;
		System.out.println("Local p = "+p);
		System.out.println("Child p = "+this.p);
		System.out.println("Parent p = "+super.p);
	}
}
