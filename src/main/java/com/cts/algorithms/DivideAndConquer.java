package com.cts.algorithms;

import java.util.Arrays;

public class DivideAndConquer {
	
	/*
	 * Problem Statement1: Merge Sort
	 */
	
	public int[] sort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }

        // divide the array in half
        int[] left = Arrays.copyOfRange(arr, 0, n/2);
        int[] right = Arrays.copyOfRange(arr, n/2, n);

        // sort/conquer each half
        int[] sortedLeft = sort(left);
        int[] sortedRight = sort(right);

        // merge/combine the sorted halves
        return merge(sortedLeft, sortedRight, n);
    }

    private int[] merge(int[] left, int[] right, int n) {
        int[] result = new int[n];
        int l = 0;
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (l < left.length && (r >= right.length || left[l] < right[r])) {
                result[i] = left[l];
                l++;
            } else {
                result[i] = right[r];
                r++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {7, 9, 2, 3, 1};
        a = new DivideAndConquer().sort(a);

        Arrays.stream(a).forEach(System.out::println);
        
        double arr[] = {25.65, 33.5, 11.9, 94.7, 62.2, 50.0};
        System.out.println(max(arr, 0, arr.length-1));
        
    }
    
    /*
	 * Problem Statement1: Find maximum number from an array
	 */
    
	static double max(double a[], int l, int r) {
		if (l == r)
			return a[l];
		int m = (l + r) / 2;
		double u = max(a, l, m);
		double v = max(a, m + 1, r);
		if (u > v)
			return u;
		else
			return v;
	}

}
