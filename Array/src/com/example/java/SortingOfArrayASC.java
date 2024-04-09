package com.example.java;

//20.Java Program to sort the elements of an array in ascending order

public class SortingOfArrayASC {
       public static void main(String args[]) {
    	   
    	   int[]arr= {3,5,2,1,4};
    	   
    	   System.out.print("Before Sorting Array: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   int temp=0;
    	   
    	   for(int j=0; j<arr.length; j++) {
    		   for(int k=j+1; k<arr.length; k++) {
    			   
    			   if(arr[j]>arr[k]) { //3>5,3>2,2>1,1>4,     5>2,5>1,5>4,   2>
    				   temp=arr[j]; //temp=3,temp=1
    				   arr[j]=arr[k]; //j=2,j=1
    				   arr[k]=temp; //k=3,k=2
    			   }
    		   }       //(2,5,3,1,4),(1,5,3,2,4),
    		   
    		   }
    	   System.out.print("\nAfter Sorting Array: ");
		   for(int i=0; i<arr.length; i++) {
			   System.out.print(arr[i]+" ");
    	   }
       }
}
