package com.exceptionHandling;

public class TryCatchDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(3);
		
		//Similar to if Else; 
		//if no exception execute try,else catch
		//manually handled by us
		try {
			System.out.println(4/0);
		}catch(Exception e)
		{
			System.out.println("yess exception recovered");
		}
		
		//if JVM handles exception it will give
		try {
			System.out.println(4/0);
		}catch(Exception e)
		{
			System.out.println(e);
			//name,description and( state : not printed )
		}
		
		System.out.println(5);
	}

}
