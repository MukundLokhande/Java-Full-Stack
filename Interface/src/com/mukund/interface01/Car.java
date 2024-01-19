package com.mukund.interface01;

class Car
{
	public static void main(String[] args)
	{
		//interface_name obj = new Class_constructor();
		
		Cars Mercedes = new PetrolCar();
		//new - new memory in heap
		//Mercedes object stores address of object of child class(PetrolCar)
		Cars Alto800 = new DieselCar();
		Mercedes.start();
		Alto800.start();
	}
}

