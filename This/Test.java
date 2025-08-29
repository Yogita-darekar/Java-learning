package com.tka.july23;

public class Test {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(1, "Yogita", 87);
		System.out.println(c);
		c.m1();
		c.m2();
		//this.m2();    can not use this in static context

	}

}
	