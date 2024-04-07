package com.example.java;

import java.util.Arrays;

//6.Program to print the sort number of an array in ASC

public class SortingnumberASC {

	public static void main(String args[]) {
		
		int[] arr= {1,5,8,2,6,4};
		
		System.out.print("Before Sorting Array: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		
		System.out.print("\nAfter Sorting Array: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
