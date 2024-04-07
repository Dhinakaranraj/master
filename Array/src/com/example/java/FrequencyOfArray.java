package com.example.java;

public class FrequencyOfArray {
	public static void main(String args[]) {
		
		int[] arr= {10,20,30,40,50,10,20,30,40,50,10,20,30,80};   
		
		int[] freq=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) { 
			
			int no=arr[i]; //10
			int count=1;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(no==arr[j]) {  //10=20,10=30,10=40,10=50,10=10,10=20,10=30,10=40,10=50,10=10
					count++; //count=2; count=3;
					freq[j]=-1;  //10=-1,10=-1
				}
			}if(freq[i]!=-1) {
				freq[i]=count; //10=3;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			
			if(freq[i]>0)
			System.out.println(arr[i] + " occurs " + freq[i]+ " times");
		}
	}

}
