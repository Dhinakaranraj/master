package com.example.java;

//3.Program to left rotate the elements of an array

public class ArrayleftRotate {
       public static void main(String args[]) {
    	   
    	   int[] arr= {10,20,30,40,50};
    	   
    	   System.out.print("Before Left Shift: ");
    	   for(int i=0; i<arr.length; i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   
    	   int temp=arr[0];  //10
    	   int i=0;
    	   
    	   while(i<=arr.length-2) { //arr[0]->5-2=3
    		   arr[i]=arr[i+1];     //arr[0]=arr[1],arr[1]=arr[2],arr[2]=arr[3],arr[3]=arr[4];
    		   i=i+1;               //10=20,        20=30,        30=40,        40=50
    	   }                        //20            30            40            50 
    	   
    	   arr[i]=temp;             // 10
    	   
    	   System.out.print("\nAfter Left Shift: ");
    	   for(int j=0; j<arr.length; j++) {     
    		   System.out.print(arr[j]+" ");
       }
}
}
