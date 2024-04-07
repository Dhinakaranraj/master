package com.example.java;

//5.Program to print the duplicate elements of an array

public class DuplicateElementOfArray {
	public static void main(String args[]) {
		
		int[]arr= {1,6,2,6,1,};
		
		System.out.print("Array Elements:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nDuplicate Array: ");
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
		
		
	}

}
