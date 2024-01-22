package com.mukund.List;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet 
{

	public static void main(String[] args) 
	{
		// UnOrdered & Unique
		
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(15);
		set.add(3);
		set.add(16);
		set.add(3);
		System.out.println("Set: "+ set);
	}
}
