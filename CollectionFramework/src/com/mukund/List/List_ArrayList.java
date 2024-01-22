package com.mukund.List;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("mukund");
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.add(2,111);
		System.out.println(list);
		
	//Generalize List with generic
		
		List<Integer> list1= new ArrayList<>();
		list1.add(100);
		list1.add(200);
        //The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)
	    //list1.add("mukund");
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		
	//By Convention
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1000);
		list2.add(2000);
		list2.add(3000);
		list2.add(4000);
		System.out.println(list2);
	
		
	}

}
