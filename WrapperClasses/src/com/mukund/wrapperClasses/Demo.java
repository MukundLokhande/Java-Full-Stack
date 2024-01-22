package com.mukund.wrapperClasses;

public class Demo 
{

	public static void main(String[] args) 
	{
		int num = 7;
		
	//Boxing : Deprecated in java9
	//Integer num1 = new Integer(num);
		
		Integer num1 = num; // AutoBoxing
	
	//Unboxing : Deprecated in java9
		int num2 = num1.intValue();
		
	//AutoUnboxing
		int num3 = num1;
		
		System.out.println("Primitive int: "+num+" object num1: "+ num1+
				"\n unboxing num2: "+num2+ " AutoUnboxing: "+ num3);
	
		//Another Example of autoUnboxing
		String str = "12";
		int x = Integer.parseInt(str);
		System.out.println(x);
	
		
		
	}

}
