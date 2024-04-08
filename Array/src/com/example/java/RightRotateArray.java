package com.example.java;

//18.Java Program to right rotate the elements of an array

public class RightRotateArray {
       public static void main(String args[]) {
    	   
    	   int[]arr= {1,2,3,4,5};
    	   
    	   System.out.print("Before Right Shift: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   int last=arr[arr.length-1];
    	   
    	   for(int i=arr.length-1; i>0; i--) {
    		   arr[i]=arr[i-1];
    	   }
    	   arr[0]=last;
    	   
    	   System.out.print("\nAfter Right Shift: ");
    	   for(int j=0; j<arr.length; j++) {
    		   System.out.print(arr[j]+" ");
    	   }
       }
}