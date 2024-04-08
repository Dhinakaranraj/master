package com.example.java;

//9.Program to print the elements of an array in reverse order

public class ReverseArray {
       public static void main(String args[]) {
    	   
    	   int[] arr= {50,40,30,20,10};
    	   
    	   System.out.print("Original Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   System.out.print("\nReverse Array: ");
    	   for(int i=arr.length-1; i>=0; i--) {  
    		   System.out.print(arr[i]+" ");
    	   }
       }
}
