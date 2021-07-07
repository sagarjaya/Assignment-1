package com.assignment.java;

public class NumberMatrix {

	public static void main(String[] args) {
		
		int array[][]= {{1},{2,3},{4,5,6},{7,8,9,10}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(array[i][j]+" "); //to display the matrix in two dimensional array
			}
			System.out.println(" ");
		}
		
	}
	}


