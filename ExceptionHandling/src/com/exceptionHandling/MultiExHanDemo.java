package com.exceptionHandling;

public class MultiExHanDemo 
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 10;
		int arr[] = {1,2,3};
		try {
			System.out.println(num1/num2);
			System.out.println(arr[6]);
		}catch(ArithmeticException e)
		{
			System.out.println("Please enter valid input");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter a proper array index value");
		}
		catch(Exception e) //father of all exception
		{
			System.out.println("please enter a non zero value");
		}
		
	}
}
