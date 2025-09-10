package com.tka.july31;

public class TestString {

	public static void main(String[] args) {
		String s = new String("Yogita");
		String s1 = s;
		System.out.println("value from heap memory: "+s);
		System.out.println("value from SCP memory: "+s.intern());
		
		System.out.println(s.hashCode()==s1.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
		StringBuffer s2 = new StringBuffer("Yogita");
		StringBuffer s3 = new StringBuffer("Yogita");
		
		System.out.println(s2.hashCode()==s3.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));
		
		StringBuffer s4 = s3;
		System.out.println(s3.hashCode()==s4.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
		

	}

}
