package com.cts.searchandsort;

import java.util.Stack;

public class StackImpl {
	
	static void stack_push(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
			stack.push(i+1);
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		stack.pop();
	}
	
	static void stack_peek(Stack<Integer> stack) {
		System.out.println("Top element in stack is: " + stack.peek());
	}
	
	static void stack_search(Stack<Integer> stack, int element) {
		int pos = stack.search(element);
		if(pos == -1) {
			System.out.println("Element " + element + " not present");
		}
		else {
			System.out.println("Element " + element + " found at position " + pos);
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
		stack.forEach(System.out::print);
	}

}
