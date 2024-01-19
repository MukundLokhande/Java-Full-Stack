package com.mukund.ak.polymorphismOverriding;

public class UpcastEx extends Upcast{
	public static void main (String[] args)
	{
		Upcast obj = new UpcastEx();
		// UpcastEx obj1 = new UpcastEx();
		// upcast obj2 = obj1
		
		//DOWN CASTING
		UpcastEx obj1 = (UpcastEx)obj;
		
		
	}
}
