package com.example.java;

//11.Program to print the elements of an array present on an odd Number

public class OddNumberArray {
      public static void main(String args[]) {
    	  
    	  int[]arr={1,2,3,4,5,6};
    	  
    	  System.out.print("Elements Of Array: ");
    	  for(int i=0; i<arr.length; i++) {
    		  System.out.print(arr[i]+" ");
    	  }
    	  
    	  System.out.print("\nOdd Number Of Array: ");
    	  for(int j=0; j<arr.length; j++) {
    		 if(arr[j]%2==1){
                 System.out.print(arr[j]+" ");
    	  }
      }
}
}
