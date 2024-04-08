package com.example.java;

//13.Program to print the elements of an array present on Odd position

public class OddPostionOfArray {
       public static void main(String args[]) {
    	   
    	   String[] arr= {"a","b","c","d","e"};
    	   
    	   System.out.print("Elements Of Array: ");
    	   for(String str: arr) {
    		   System.out.print(str+" ");
    	   }
    	   
    	   System.out.print("\nOdd Position Of Array: ");
    	   for(int i=0; i<arr.length; i+=2) {
    		   System.out.print(arr[i]+" ");
    	   }
       }
}
