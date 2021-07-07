package com.assignment.java;
import java.util.Scanner;
public class ArmstrongPalindrome {// program to check if the number is armstrong or palindrome or perfect number or none of these

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=scan.nextInt();
		scan.close();
		int sum=0;
		int num1=num;
		int rem=0;
		while(num1!=0) { // to check if a number is armstrong number
			rem=num1%10;
			sum=sum+(rem*rem*rem);
			num1=num1/10;	
		}
		if(sum==num) { // if condition is false then it will check for palindrome number
		System.out.print(num+" is armstrong number");
	}else { 
		sum=0;
		num1=num;
		rem=0;
		while(num1>0) { // to check for palindrome number
			rem=num1%10;
			sum=(sum*10)+rem;
			num1=num1/10;
		}
		if(sum==num) {  // if condition is false then it will check for perfect number
			System.out.print(num+" is a palindrome number");
		}else {
			num1=num;
			sum=0;
			for(int i=1;i<num1;i++) {
				if(num1%i==0) {
					sum=sum+i;
				}
				
			}
			if(sum==num) { // if the condition is false then it will print none of these numbers
				System.out.print(num+" is Perfect number");
			}else {
				System.out.print("None of these number");
			}
		}
	}
		
		}
	}



