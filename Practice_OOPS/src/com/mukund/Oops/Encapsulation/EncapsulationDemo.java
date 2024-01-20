package com.mukund.Oops.Encapsulation;

public class EncapsulationDemo 
{
	private int id;
	private String name;
	private float number;
	
	EncapsulationDemo(int id,String name, float number)
	{
		this.id = id;
		this.name = name;
		this.number = number;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getNumber()
	{
		return number;
	}
	
}
