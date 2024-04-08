package com.example.java;

//17.Java Program to print the sum of all the items of the array

public class SumOfArray {
	public static void main(String args[]) {
		
		int[]arr= {12,56,87,45,89,93};
		
		System.out.print("Elements Of Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int sum=0;
		
		for(int j=0; j<arr.length; j++) {
			
			sum+=arr[j];
		}
		System.out.print("\nSum Of Array: "+sum);
	}

}
