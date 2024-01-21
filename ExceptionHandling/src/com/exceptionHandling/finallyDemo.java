package com.exceptionHandling;

public class finallyDemo {

	public static void main(String[] args) 
	{
		System.out.println(1);
	
		// try - catch - finally
		try 
		{
			System.out.println(2/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled from catch block");
		}
		finally
		{
			System.out.println("I will print my block, independently");
		}
		
		System.out.println(3);
		
		//try - finally
		//exception not handled | used for closing
		
		try
		{
			System.out.println(4/0);
		}
		finally
		{
			System.out.println("hii, from finally block");
		}
		
		System.out.println("will i print");
	}

}
