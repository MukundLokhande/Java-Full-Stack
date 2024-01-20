package com.mukund.Oops.polymorphism.Overloading;

public class ConstructorOverloadingDemo 
{
	
	ConstructorOverloadingDemo(int x)
	{
		System.out.println("Single paramer");
	}
	ConstructorOverloadingDemo(int id,String name)
	{
		System.out.println("2 para constructor called");
	}
}
