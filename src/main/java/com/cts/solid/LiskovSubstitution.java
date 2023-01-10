package com.cts.solid;

public class LiskovSubstitution {

}

class Amphibian {

    public void swim() {
    	System.out.println("I can Swim");
    };
    public void walk() {
    	System.out.println("I can walk");
    }

}

class Frog extends Amphibian {
    public void swim() {
        System.out.println("The frog is swimming");
    }
    
    public void walk() {
        System.out.println("The frog is walking on land");
    }
}



