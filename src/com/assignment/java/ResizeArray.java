package com.assignment.java;

import java.util.*;// for 2nd approch

public class ResizeArray {

	public static void main(String[] args) {
		
		
		int number[] = {1,2,3,4};// initializing 1st array
		int length=number.length;
    	System.out.println("Array before Resize:");
        for (int i=0;i<length;i++) {
            System.out.print(number[i]+" ");
        }
 
        int temp[]=new int[5];//2nd new array
        for (int j=0; j<number.length;j++) {
          temp[j]=number[j]; // copying elements from 1st array to 2nd array
        }
        
        System.out.println("");
        System.out.println("Array after ReSize: ");//printing array elements after resize
        for (int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
        
    /* 2nd approch 
		List<Integer> number=new ArrayList<Integer>();// you can add n number of elements as there is no fixed size limit in ArrayList
		number.add(1);
		number.add(2);
		number.add(3);
		for(int i:number) {
			System.out.println(i);
		}
		*/
		
	}
}
