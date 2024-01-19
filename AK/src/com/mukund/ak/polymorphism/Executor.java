package com.mukund.ak.polymorphism;

public class Executor {
	public static void main (String[] args)
	{
		PolymorphismDemo obj = new PolymorphismDemo();
		PolymorphismDemo obj1 = new PolymorphismDemo();
		obj.run();
		obj.run(23);
		obj.run(23,17);
	
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj1));
	}
}
