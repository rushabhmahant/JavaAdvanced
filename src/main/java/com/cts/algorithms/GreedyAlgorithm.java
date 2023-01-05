package com.cts.algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class GreedyAlgorithm {
	
	/*
	 * Problem Statement: You have to make a change of 
	 * an amount using the smallest possible
	 * number of coins. Ex. Amount: $18
	 * 
	 * Available coins are 
	 * $5 coin 
	 * $2 coin 
	 * $1 coin 
	 * There is no limit to the number
	 * of each coin you can use.
	 */
	
	public static void main(String[] args) {
		
		int amount = 36;
		ArrayList<Integer> availableCoins = new ArrayList<Integer>();
		availableCoins.add(5);
		availableCoins.add(2);
		availableCoins.add(1);
		
		ArrayList<Integer> solutionSet = new ArrayList<Integer>();
		
		Collections.sort(availableCoins, Collections.reverseOrder());
		
		//	Greedy Algorithm - For each iteration,
		//	select the maximum possible coin value
		//	to reduce the number of coins.
		for(int coin: availableCoins) {
			while(amount>=coin) {
				solutionSet.add(coin);
				amount -= coin;
			}
		}
		System.out.println(solutionSet);
		
		System.out.println("No. of $5 coins: " + solutionSet.stream().filter(x -> x == 5).count());
		System.out.println("No. of $2 coins: " + solutionSet.stream().filter(x -> x == 2).count());
		System.out.println("No. of $1 coins: " + solutionSet.stream().filter(x -> x == 1).count());
		System.out.println("Total coins: " + solutionSet.size());
		
		System.out.println("**********");
		
		//	Another possible approach (Not a greedy technique)
		
		int tempAmount = 36;
		ArrayList<Integer> tempSolutionSet = new ArrayList<Integer>();
		
		Collections.sort(availableCoins);
		
		for(int coin: availableCoins) {
			while(tempAmount>=coin) {
				tempSolutionSet.add(coin);
				tempAmount -= coin;
			}
		}
		System.out.println(tempSolutionSet);
		
		System.out.println("No. of $5 coins: " + tempSolutionSet.stream().filter(x -> x == 5).count());
		System.out.println("No. of $2 coins: " + tempSolutionSet.stream().filter(x -> x == 2).count());
		System.out.println("No. of $1 coins: " + tempSolutionSet.stream().filter(x -> x == 1).count());
		System.out.println("Total coins: " + tempSolutionSet.size());
		
	}

}
