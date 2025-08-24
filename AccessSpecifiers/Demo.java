package com.tka.client;

public class Demo {
	
	private int var1 = 10;
	static int var2 = 100;
	protected int var3 = 1000;
	public int var4 = 400;
	Demo()
	{
		System.out.println("Demo constructor called");
	}
	
	private void m1()
	{
		System.out.println(111);
	}
	
	public static Demo m10()
	{
		Demo obj = new Demo();
		return obj;
	}

}
