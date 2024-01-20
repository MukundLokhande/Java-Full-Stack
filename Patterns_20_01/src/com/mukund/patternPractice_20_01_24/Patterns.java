package com.mukund.patternPractice_20_01_24;

public class Patterns {
	static int row , col;
	public static void main(String[] args) 
	{	
		pattern01(4);
		pattern02(5);
		pattern03(4);
		pattern04(5);
		pattern05(6);
	}
	
	//01
	static void pattern01(int n)
	{
		for ( row = 1; row <= n ; row++)
		{
			for ( col = 1; col <= n; col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("");
	}
	
	//02
	static void pattern02(int n)
	{
		for ( row = 1 ; row <= n; row++)
		{
			for ( col = 1 ; col <= row ; col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	
	//03
	static void pattern03(int n)
	{
		for ( row = 1;row <= n ; row++)
		{
			for ( col = n+1 - row ; col >= 1 ; col-- )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//04
	static void pattern04(int n)
	{
		for (row = 1; row <= n ; row++)
		{
			for (col = 1; col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//05
	static void pattern05(int n)
	{
		for (row = 1;row <= n ; row++)
		{
			for (col=1;col<=row ; col++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (row = 1; row < n ;row++)
		{
			for (col = n-row; col>0 ; col--)
			{
				System.out.print("*");
			}
			System.out.println("");		
		}
		System.out.println("");
	}
}
