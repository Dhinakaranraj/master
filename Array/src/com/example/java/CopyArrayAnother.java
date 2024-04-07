package com.example.java;

//1.Program to copy all elements of one array into another array

public class CopyArrayAnother {
	public static void main(String args[]) {
		
		int[] org= {34,89,56,46,23};
		int[]copy=org;
		
		System.out.print("Orginal Array: ");
		for(int i: org) {
			System.out.print(i+" ");
		}
		System.out.print("\nCopyed Array: ");
		for(int i: copy) {
			System.out.print(i+" ");
	}

}
}
