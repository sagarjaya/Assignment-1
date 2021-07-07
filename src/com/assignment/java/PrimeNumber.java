package com.assignment.java;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a  number : ");
		int number=scan.nextInt();//taking input from the user
		scan.close();
		
		int count=0;
		for(int i=1;i<=number;i++) {
		if(number%i==0) {
			count++;
		}
		}
		if(count==2) {//if the factor is 2 then it will print prime number
			System.out.print(number+" is Prime number");
		}else {
			System.out.print(number+" is not a prime number");
		}
		
		/* 2nd approch
		int flag=1;
		int m=number/2;
		for(int i=2;i<=m;i++) {
			if(number%i==0)
			{
				System.out.print(number+" is not a prime number");
				flag=0;
				break;
			}
			
		}
		if(flag==1) { //if its true then it will be printed 
			System.out.print(number+" is a prime number");
			
		}
		*/
	}
}
