package com.mukund.List;

import java.util.TreeSet;

public class Set_SortedSet_TreeSet {

	public static void main(String[] args) 
	{
		//Sorted & Unique & Unordered
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(10);
		treeset.add(20);
		treeset.add(50);
		treeset.add(40);
		treeset.add(40);
		System.out.println("Unique | Unordered | Sorted : TreeSet: "+treeset);
	
	}

}
