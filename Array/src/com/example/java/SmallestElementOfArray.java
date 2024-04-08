package com.example.java;

//15.Program to print the smallest element in an array

public class SmallestElementOfArray {
       public static void main(String args[]) {
    	   
    	   int[]arr={34,56,7,56,89,78};
    	   
    	   System.out.print("Elements Of Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   int min=arr[0];
    	   
    	   for(int i=0; i<arr.length; i++) {
    		   if(min>arr[i]) {
    			   min=arr[i];
    		   }
    	   }
    	   System.out.print("\nSmallest Element Of Array: "+min);
       }
}
