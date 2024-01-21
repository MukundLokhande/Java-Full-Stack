package com.exceptionHandling;
import java.util.Scanner;
public class tryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try with resource after java9
		Scanner scan = new Scanner(System.in);
		try(scan)
		{
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
