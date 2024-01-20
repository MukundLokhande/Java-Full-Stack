package com.mukund.Oops.Interfaces;

public class InterfaceDemo implements Animal
{
	public void run()
	{
		System.out.println("Running");
	}
	
	public void hunt()
	{
		System.out.println("Hunt for Survival");
	}
	 
	public void legs(int legs)
	{
		System.out.println("total legs "+legs);
	}
}
