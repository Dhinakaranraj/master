package com.example.java;

//10.Program to print the elements of an array present on an even number

public class EvenNumberOfArray {
       public static void main(String args[]) {
    	   
    	   int[] arr= {1,2,3,4,5,6};
    	   
    	   System.out.print("Elements Of Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   System.out.print("\nEven Number Array: ");
    	   for(int j=0; j<arr.length; j++) {
    		   if(arr[j]%2==0){
                        System.out.print(arr[j]+" ");
    	   }
       }
}
}
