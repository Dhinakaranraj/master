package com.example.java;

//23.Java Program to find Second Largest Number in an Array

public class SecondLargesNumber {
       public static void main(String args[]) {
    	   
    	   int[]arr= {23,67,29,76,59,21};
    	   
    	   System.out.print("Elements Of Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   for(int j=0; j<arr.length; j++) {
    		   for(int k=j+1; k<arr.length; k++) {
    			   
    			   if(arr[j]<arr[k]) {
    			   int temp=arr[j];
    				   arr[j]=arr[k];
    				   arr[k]=temp;
    			   }
    		   }
    	   }
    	   System.out.print("\nSecond Largest Number Is: "+arr[1]);
       }
}
