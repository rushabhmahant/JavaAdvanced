package com.cts.collectionimpl;

import java.util.stream.IntStream;

public class LinkedListImpl {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public static void insert(LinkedListImpl linkedList, int element) {
		Node newNode = new Node(element);
		Node currentNode = linkedList.head;
		if(currentNode == null) {
			linkedList.head = newNode;
		}
		else {
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	
	public static void print(LinkedListImpl linkedList) {
		if(linkedList.head == null) {
			System.out.println("List is empty");
		}
		else {
			Node currentNode = linkedList.head;
			while(currentNode != null) {
				System.out.print(currentNode.data);
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
	
	public static void remove(LinkedListImpl linkedList, int element) {
		Node currentNode = linkedList.head;
		if(currentNode == null) {
			System.out.println("Cannot remove element, list is empty");
		}
		else {
			if(currentNode.data == element) {
				linkedList.head = linkedList.head.next;
				return;
			}
			Node nextNode = currentNode.next;
			while(nextNode != null) {
				if(nextNode.data == element) {
					currentNode.next = nextNode.next;
					break;
				}
				currentNode = currentNode.next;
				nextNode = nextNode.next;
			}
			if(nextNode == null) {
				System.out.println("Cannot remove element, element not present in list");
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedListImpl linkedList = new LinkedListImpl();
		//	print(linkedList);
		IntStream.range(1, 10).forEach((n) -> insert(linkedList, n));
		System.out.println("Initial LinkedList:");
		print(linkedList);
		remove(linkedList, 9);
		System.out.println("After removing element:");
		print(linkedList);
	}

}
