package com.assignment.java;

public class ResultStudent {

	public static void main(String[] args) {
	

		int arr[][]= {{47,75,80},{52,81,76},{50,50,50}}; // taking no of students in rows and marks as columns
		int sum;
		double avg=0;
		System.out.println("Calculate Results");
		for(int i=0;i<3;i++) {
			sum=0;
			for(int j=0;j<3;j++) {
				sum=sum+arr[i][j];// calculating results
			}
			avg=sum/3;
			System.out.println("");
			System.out.println(i+1+" Sudent marks: "+sum);
			System.out.println("  Percentage marks: "+avg);
		}
	}

}
