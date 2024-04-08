package com.example.java;

//19.Java Program to left rotate the elements of an array

public class LeftRotateArray {
	public static void main(String args[]) {
		
		int[]arr= {1,2,3,4,5};
		
		System.out.print("Before Left Shift: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int first=arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=first;
		
		System.out.print("\nAfter Left Shift: ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
