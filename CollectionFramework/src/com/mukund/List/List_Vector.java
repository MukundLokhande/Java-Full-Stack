package com.mukund.List;

import java.util.List;
import java.util.Vector;

public class List_Vector 
{
	public static void main(String[] args) 
	{
		Vector vector = new Vector();
		vector.add(2);
		vector.add(34);
		vector.add("Mukund");
		vector.add('#');
		System.out.println(vector);
		
		//
		Vector<Integer> vector1 = new Vector<>();
		vector1.add(123);
		vector1.add(456);
		System.out.println(vector1);
		//
		Vector vector2 = new Vector<Integer>();
		vector2.add(321);
		vector2.add(343);
		System.out.println(vector2);
		
		//Vector class implements List Interface
		List vectorObject = new Vector<Integer>();
		vectorObject.add(111);
		vectorObject.add(222);
		vectorObject.add(2,333);
		System.out.println(vectorObject);
		
		vector.clear();
		System.out.println(vector);
		
		Object vector5 = new Vector<Integer>();
		vector5 = vector2.clone();
	}

}
