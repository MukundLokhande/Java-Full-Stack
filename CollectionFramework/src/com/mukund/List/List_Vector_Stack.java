package com.mukund.List;

import java.util.Stack;

public class List_Vector_Stack {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(100);
		stack.push(150);
		System.out.println("Stack: "+ stack);
		System.out.println("peek: "+stack.peek());
		stack.pop();
		System.out.println("Stack: "+stack);
		System.out.println("peek: "+stack.peek());
		stack.clear();
		System.out.println("Stack: "+stack);
	}

}
