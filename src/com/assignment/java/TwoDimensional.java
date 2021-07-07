package com.assignment.java;

public class TwoDimensional {

	public static void main(String[] args) {

		int array[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] +" ");//to display the matrix in two dimensional array
			}
			System.out.println();
		}
		/*
		for(int i=0;i<4;i++) { //2nd approch
			for(int j=0;j<4;j++) {
				System.out.print(array[i][j] +" ");//to display the matrix in two dimensional array
			}
			System.out.println();
		}
		*/
		
	}

}
