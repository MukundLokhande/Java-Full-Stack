package com.mukund.ak.abstraction;

public class Muku extends Aksh
{
	public void walk()
	{
		System.out.println("Akshu can Walk fastttt");
	}
	//Constructor loads non- static members of class
	//due to object class load all method, 
	//100% abstraction is not achieved.
	//100% Abstraction is achieved through interfaces
	public static void main(String[] args) 
	{
		Aksh obj = new Muku();
		obj.walk();
	}

}
