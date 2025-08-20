package com.tka.july2;

public class Student {
	public void m1()
	{
		System.out.println("Start of the m1");
		System.out.println(111);
		Student s1 = new Student();
		System.out.println(s1);
		s1.m2();
		System.out.println("End of the m1");
	}
	public void m2()
	{
		System.out.println("Start of the m2");
		System.out.println(222);
		System.out.println("End of the m2");
	}

}
