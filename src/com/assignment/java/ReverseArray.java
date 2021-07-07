package com.assignment.java;

public class ReverseArray {

	public static void main(String[] args) {
		
		int number[]= {1,2,3,4,5};
		
		System.out.println("Original elements of an array");//original elements of an array
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("Reverse elements of an array");//to reverse an elements in the array
		for(int j=number.length-1;j>=0;j--) {
			System.out.print(number[j]+" ");
		}
	}

}
