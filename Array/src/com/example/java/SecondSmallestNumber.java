package com.example.java;

//25.Java Program to find 2nd Smallest Number in an Array

public class SecondSmallestNumber {
    public static void main(String args[]) {
    	
    	int[]arr= {23,45,67,45,65,25,22,43,12};
    	
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
    	System.out.print("\nSecond Smallest Number Is: "+arr[1]);
    }
}
