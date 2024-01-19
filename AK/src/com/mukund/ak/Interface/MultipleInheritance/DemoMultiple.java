package com.mukund.ak.Interface.MultipleInheritance;

public class DemoMultiple implements ParentA,ParentB
{	
	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("implementation !!!");
	}
	public static void main (String[] args)
	{
		DemoMultiple obj = new DemoMultiple();
		System.out.println(obj.pi);
		System.out.println(obj.Daa);
		
		obj.Run();
	}
	
}
