package com.example.java;

//21.Java Program to sort the elements of an array in descending order

public class SortingOfArrayDSC {
	  public static void main(String args[]) {
		  
		  int[]arr= {1,2,3,4,5};
		  
		  System.out.print("Before Sorting For DSC: ");
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i]+" ");                       // first round of j=(2,1,3,4,5), (3,1,2,4,5), (4,1,2,3,5),   (5,1,2,3,4)
		  }
		  
		  int temp;
		  
		  for(int j=0; j<arr.length; j++) {
			  for(int k=j+1; k<arr.length; k++) {
				  
				  if(arr[j]<arr[k]) {
					  temp=arr[j];
					  arr[j]=arr[k];
					  arr[k]=temp;
				  }
			  }
		  }
		  System.out.print("\nAfter Sorting For DSC: ");
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i]+" ");
		  }
		  
	  }

}
