package com.tka.july31;

public class Test {

	public static void main(String[] args) {
		String s = "Instagram";
		
//		for(int i =0; i<s.length();i++)
//		{
//			System.out.println(i +"--->" + s.charAt(i));
//		}
//		for(int i =(s.length()-1) ; i>=0 ; i--)
//		{
//			System.out.println(i +"--->" + s.charAt(i));
//		}
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(i + "---->" +s.charAt(s.length()-1-i));
		}
	}

}
