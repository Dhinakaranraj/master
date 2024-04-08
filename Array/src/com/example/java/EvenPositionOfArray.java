package com.example.java;

//12.Program to print the elements of an array present on even position

public class EvenPositionOfArray {
	public static void main(String args[]) {
		
		String[]arr={"a","b","c","d","e"};
		
		System.out.print("Elements Of Array: ");
		for(String s: arr) {
			System.out.print(s+" ");
		}
		
		System.out.print("\nEven Positon Of Array: ");
		for(int i=1; i<arr.length; i+=2) {
			System.out.print(arr[i]+" ");
		}
	}

}
