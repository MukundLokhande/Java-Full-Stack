package com.mukund.ak.polymorphism;
/* poly : compile(method overloading & contructor overloading)
		& runtime(derived typecasting:( upcasting & downcasting) and method overriding)
*/
public class PolymorphismDemo 
{
	//MEthod Overloading
	int p ;
	public void run()
	{
		System.out.println("run");
	}
	public void run(int x)
	{
		System.out.println("run X: "+ x);
	}
	public void run(int x,int y)
	{
		System.out.println("run X And Y: "+ x + y);
	}
}
