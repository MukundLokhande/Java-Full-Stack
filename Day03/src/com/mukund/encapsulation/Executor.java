package com.mukund.encapsulation;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setLaptopName("HP");
		obj.setPrice(4645.14f);
		obj.setSerialNumber(123456);
		System.out.println(obj.getLaptopName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getSerialNumber());
	}

}
