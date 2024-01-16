package com.mukund.controlstatements;

public class ContinueDemo {

	public static void main(String[] args) {

			for (int i = 5; i < 10; i++) {
				if (i == 7)
					continue;
				System.out.println(i);
			}
			System.out.println("jump of the loop");
		
	}

}
