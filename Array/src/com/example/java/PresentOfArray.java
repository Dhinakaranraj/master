package com.example.java;

//16.Java Program to print the number of elements present in an array

public class PresentOfArray {
        public static void main(String args[]) {
        	
        	int[]arr ={10,27,34,42,7,90,56};
        	
        	System.out.print("Elements Of Array: ");
        	for(int i=0; i<arr.length; i++) {
        		System.out.print(arr[i]+" ");
        	}
        	
        	System.out.print("\nNumber Of Elements Present In Array: "+arr.length);
        }
}
