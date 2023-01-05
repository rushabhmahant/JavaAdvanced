package com.cts.algorithms;

public class DynamicProgramming {
	
	/*
	 * Problem Statement: Given an integer K, 
	 * minimize steps to reach K 
	 * from 0 by adding 1 or 
	 * doubling at each step.
	 */
	
	public static void main(String[] args) {
		
		//	Approach 1: Does not give expected result
		int K = 12;
		int currentPosition = 0;
		int steps = 0;
		
		if(K>0) {
			currentPosition += 1;
			steps++;
			while(currentPosition<K) {
				if((K/currentPosition) > 1) {
					currentPosition *= 2;
					steps++;
				}
				else {
					currentPosition++;
					steps++;
				}
			}
		}
		
		System.out.println("Minimum steps required: " + steps);
		
		//	Approach 2
		System.out.println(minOperation(K));
	}
	
	static int minOperation(int k)
	{
	     
	    // Approach 2: Produces the expected output correctly
	    int steps[] = new int[k + 1];
	 
	    for(int i = 1; i <= k; i++)
	    {
	    	steps[i] = steps[i - 1] + 1;
	        
	       // For all even numbers
	       if (i % 2 == 0)
	       {
	    	   steps[i] = Math.min(steps[i], steps[i / 2] + 1);
	       }
	    }
	    return steps[k];
	}

}
