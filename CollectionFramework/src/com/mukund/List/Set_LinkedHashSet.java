package com.mukund.List;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) 
	{
		// Ordered and Unique
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(40);
		set1.add(50);
		System.out.println(set1);
		
		boolean b1 = set1.contains(30);
		System.out.println("30 present or not? "+ b1);
	}

}
