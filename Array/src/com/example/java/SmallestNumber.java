package com.example.java;

//24.Java Program to find Smallest Number in an Array

public class SmallestNumber {
	public static void main(String args[]) {
		
		int[]arr= {45,67,76,43,82,12,23};
		
		System.out.print("Elements Of Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				
				if(arr[j]>arr[k]) {
				  int temp=arr[j];
				      arr[j]=arr[k];
				      arr[k]=temp;
				}
			}
		}
		System.out.print("\nSmallest Number IS: "+arr[0]);
	}

}
