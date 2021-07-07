package com.assignment.java;
import java.util.*; // for 2nd approch

public class SortArray {
	public static void main(String[] args) {
		int number[]= {2,1,5,4,3};
		
		int temp;
		System.out.println("Before sorting");
		for(int k=0;k<number.length;k++) {
			System.out.print(number[k]+" ");
		}
		System.out.println(" ");
		System.out.println("Sorting in Ascending order");//printing in ascending order
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
				System.out.print(number[i]+" ");		
			}
		System.out.println(" ");
		System.out.println("Sorting in Descending order");//printing in descending order
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]<number[j]) {
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
				System.out.print(number[i]+" ");		
			}
		
		/*
		Arrays.sort(number); //2nd approch
		for(int k=0;k<number.length;k++) {
			System.out.print(number[k]+" "); // it will sort the data in the ascending order
		}
		*/
		
	}
}
