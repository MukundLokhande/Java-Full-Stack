package com.mukund.Oops.polymorphism.Overloading;

public class MethodOverloadingDemo 
{
	public void Customer(int id,String name,String Addr)
	{
		System.out.println(id + name + Addr);
	}
	public void Customer(int id)
	{
		System.out.println(id);
	}
	public void Customer(String name)
	{
		System.out.println(name);
	}
}
