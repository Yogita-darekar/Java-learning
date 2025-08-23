package com.tka.july11;

public class Student {
	int roll;
	String name;
	int marks;
	
	//zero para constructor
	Student()
	{
		 System.out.println("zero para constructor");
	}
	
	Student(int r)
	{
		 roll = r;
		 System.out.println("one para constructor");
	}
	
	Student(int r, String s)
	{
		roll = r;
		name = s;
		 System.out.println("Two para constructor");
	}
	
	Student(int r, String s, int m)
	{
		roll = r;
		name = s;
		marks = m;
		 System.out.println("Three para constructor");
	}
	

}
