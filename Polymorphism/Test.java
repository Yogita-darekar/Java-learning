package com.tka.july17;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		Calculator c1 = new Calculator(999,"TATA");
		System.out.println(c.add(10, 30));
		System.out.println(c.add(10.56, 30.8));
		System.out.println(c.add(10157234, 302235456));
		System.out.println(c.add(103.36545456, 30.27563475));
	}

}
