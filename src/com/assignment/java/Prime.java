package com.assignment.java;

public class Prime {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Prime numbers between 1 to 100 :");
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++) 	
			{
				if(i%j==0) {
					count=count+1;
				}
			}		
			
		if(count==0) {
			System.out.print(i+" ");
		}else {
			count=0;
		}	
		}
	}
}
