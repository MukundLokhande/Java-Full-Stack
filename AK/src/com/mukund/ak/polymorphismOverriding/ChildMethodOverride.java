package com.mukund.ak.polymorphismOverriding;

public class ChildMethodOverride extends ParentMethodOverride
{	//method header of child => visibility then parent ()header
	public void Sun()
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
		ParentMethodOverride obj = new ChildMethodOverride();
		obj.Sun();
	}
	//parent method implementation hide and child class method displays
	// or chils class () overrides parent class ()

}
