package com.mukund.controlstatements;
class SwitchDemo{
	public static void main(String[] args)
	{
		int day = 2;
		
		switch (day)
		{
		case 1:
			System.out.println("Yess 1");
			break;
		case 2:
			System.out.println("yess 2");
			break;
		case 3:
			System.out.println("yess 3");
			break;
		case 4:
			System.out.println("yess 4");
			break;
		default:
			System.out.println("not matched");
		}
	}
}