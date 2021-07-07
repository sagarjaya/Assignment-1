package com.assignment.java;
import java.util.Scanner;

public class AverageNumber {
	
	public void averageNum(Scanner input) {//this method will print average of n numbers		
		int no=0,sum=0,avg=0;
		System.out.print("Enter the value of n : ");
		int number=input.nextInt();
		System.out.print("Enter the elements of n : ");
		for(int i=0;i<number;i++) {
		 no=input.nextInt();
		 sum=sum+no;
		 avg=sum/number;
		}
		System.out.println("Sum of elements : "+sum);
		System.out.println("Average of elements : "+avg);
	}
	public static void main(String[] args) {	
		AverageNumber average=new AverageNumber();//creating object of the class
		Scanner number=new Scanner(System.in);
		average.averageNum(number);
		
		
	/*2nd approch without method
	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int no=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int number=input.nextInt();
		System.out.print("Enter the elements of n : ");
		for(int i=0;i<number;i++) {
			 no=input.nextInt();
			 sum=sum+no;
			 avg=sum/number;
			}
			
			System.out.println("Sum of elements : "+sum);
			System.out.println("Average of elements : "+avg);
	*/	
		}
	}

