package com.tka.aug12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(200);
		hs.add(100);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		System.out.println(hs);
		for(int i : hs)
		{
			System.out.println(i);
		}
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(200);
		ts.add(100);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		ts.add(600);
		System.out.println(ts);
		for(int i : ts)
		{
			System.out.println(i);
		}
		
		Set <Integer>  lhs = new LinkedHashSet<>();
		lhs.add(-23);
		lhs.add(300);
		lhs.add(500);
		lhs.add(-99);
		lhs.add(400);
		lhs.add(0);
		System.out.println(lhs);
		for(int i : lhs)
		{
			System.out.println(i);
		}
		
		//List<Integer> marks = new ArrayList(hs);
	}

}
