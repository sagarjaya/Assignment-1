package com.assignment.java;

public class LocationOfElementLinearSearch {

	public static void main(String[] args) {
		
		int number[]= {2,4,6,8,10,12};
		int location=4; // to find an element 
		
		System.out.println("Array elements of an array");//original array elements
		for(int k=0;k<number.length;k++) {
			System.out.print(number[k]+" ");
		}
		
		System.out.println(" ");
		for(int i=0;i<number.length;i++) {//to find an element in an array
			if(number[i]==location) {
				System.out.println("Element " +number[i]+" is found at "+i+" location(index) in an array");
		}
	}
}
}
