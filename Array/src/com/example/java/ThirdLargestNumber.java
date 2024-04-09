package com.example.java;

//22.Java Program to find Third Largest Number in an Array

public class ThirdLargestNumber {
	public static void main(String args[]) {
		
		int[]arr= {23,89,45,78,34,56};
		
		System.out.print("Elements Of Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				
				if(arr[j]<arr[k]) {
				int	temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.print("\nThird Largest Number Is: "+arr[2]);
	}

}
