package com.cts.java8.mr;

interface Creature {
	String talk();
}

public class MethodReference {
	
	static String dogSound() {
		return "Bark";
	}
	
	static String catSound() {
		return "Meow";
	}
	
	static String horseSound() {
		return "Neigh";
	}
	
	public static void main(String[] args) {
		Creature dog = MethodReference::dogSound;
		Creature cat = MethodReference::catSound;
		Creature horse = MethodReference::horseSound;
		
		System.out.println(dog.talk());
		System.out.println(cat.talk());
		System.out.println(horse.talk());
	}

}
