package com.example.java;

//26.Java Program to remove duplicate element in an Array(method 1)

public class RemoveDuplicateElements {
     public static void main(String args[]) {
    	 
    	 int[]arr= {10,20,20,30,30,40,50,50};
    	 
    	 int[]arr1=new int[arr.length];            //10,20,30,40,
    	 
    	 System.out.print("Before Remove Duplicate Elements: ");
    	 for(int i=0; i<arr.length; i++) {
    		 System.out.print(arr[i]+" ");
    	 }
    	 int k=0; //k=1,2,3,4
    	 
    	 for(int j=0; j<arr.length-1; j++) {
    		 
    		 if(arr[j]!=arr[j+1]) {
    			 
    			 arr1[k]=arr[j];
    			 k++;
    		 }
    	 }
    	 arr1[k] = arr[arr.length - 1];
    	 
    	 System.out.print("\nAfter Remove Duplicate Elements: ");
    	 for(int m=0; m<arr1.length; m++) {
    		 if(arr1[m]!=0) 
    			 System.out.print(arr1[m]+" ");
    	 }
    	 
     }
}
