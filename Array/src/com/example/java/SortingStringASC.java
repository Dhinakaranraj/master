package com.example.java;

import java.util.Arrays;

//7.Program to print the sort number of an array in ASC

public class SortingStringASC {

	public static void main(String args[]) {
		
		String[] name= {"karthi","murali","appu","vinoth","sarath"};
		
		System.out.println("Before sorting string: ");
		for(String s: name) {
			System.out.print(s+" ");
		}
		
		Arrays.sort(name);
		
		System.out.println("\nAfter sorting string: ");
		for(String s: name) {
			System.out.print(s+" ");
	}
}
}
