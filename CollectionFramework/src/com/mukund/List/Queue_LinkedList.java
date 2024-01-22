package com.mukund.List;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_LinkedList {

	public static void main(String[] args) {
		//Always use offer() over add()
		//Always use poll() over remove()
		
		//push | pop in Stack
		//offer | poll in Queue
		
		Queue<Integer> set1 = new LinkedList<Integer>();
		set1.add(10);
		set1.offer(20);
		set1.add(60);
		set1.offer(40);
		set1.add(40);
		set1.offer(50);
		System.out.println(set1);
		System.out.println(set1.peek());
		
		
}

}
