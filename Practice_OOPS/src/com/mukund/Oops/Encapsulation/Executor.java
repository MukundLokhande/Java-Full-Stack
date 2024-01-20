package com.mukund.Oops.Encapsulation;

public class Executor 
{	
	public static void main(String[] args)
	{
	
	
		EncapsulationDemo obj = new EncapsulationDemo(15,"Mukund",34.212f);
		System.out.println(obj.getId()+" "+ obj.getName()+" "+ obj.getNumber());
	}
}
