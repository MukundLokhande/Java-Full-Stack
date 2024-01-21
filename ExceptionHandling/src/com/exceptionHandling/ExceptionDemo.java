package com.exceptionHandling;
import java.util.ArrayList;
public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
//exception in thread main: RunTime
//java.lang.ArithmeticException
		System.out.println(4/0);
		System.out.println(5);
//Runtime Exception: ArrayOutOfBound		
		int arr[] = {1,2};
		System.out.println(arr[3]);
		
//Error: OutOFMemory Error : Java Heap Space
		ArrayList<Integer> a1 = new ArrayList<>();
		while (true)
		{
			a1.add(1);
		}
	}

}
