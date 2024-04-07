package com.example.java;

public class ArrayRigthRotate {
	public static void main(String args[]) {
		
		int[] arr= {20,30,40,50,60,10};
		
		System.out.print("Before right shift: ");
		for(int i=0; i<arr.length; i++) {
		     System.out.print(arr[i]+" ");	
		}
		
		int temp=arr[arr.length-1];
		int i=arr.length-1;
		
		while(i>0) {
			
			arr[i]=arr[i-1];
			i=i-1;
		}
		
		arr[i]=temp;
		
		System.out.print("\nBefore right shift: ");
		for(int j=0; j<arr.length; j++) {
		     System.out.print(arr[j]+" ");	
		}
	}
	
	
	

}
