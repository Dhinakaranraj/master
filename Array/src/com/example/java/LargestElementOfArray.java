package com.example.java;

//14.Program to print the largest element in an array

public class LargestElementOfArray {
       public static void main(String args[]) {
    	   
    	   int[]arr={98,101,100,74,20};
    	   
    	   System.out.print("Elements Of Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   int max=arr[0];   //98,//101
    	   
    	   
    	   for(int j=0; j<arr.length; j++) {
    		   if(max < arr[j]) {    //98<101,101<101,101<100,101<74,101<20
    			   max=arr[j];   //101
    		   }
    	   }
    	   System.out.print("\nLargest Element Of Array: "+max); //101
       }
	
}
