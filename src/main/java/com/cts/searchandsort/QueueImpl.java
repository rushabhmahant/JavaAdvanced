package com.cts.searchandsort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class QueueImpl {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		IntStream.rangeClosed(1, 5).forEach(q::add);
		
		System.out.println("Elements in queue: " + q);
		
		//	Remove head of the queue
		int removedElement = q.remove();
		
		System.out.println("Queue after removing head" + removedElement + ": " + q);
		
		//	View the head of the queue
		System.out.println("Head element: " + q.peek());
		
		
		
		
	}

}
