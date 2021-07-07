/**
 * 
 */
package com.assignment.java;

/**
 * @author lenovo;
 *
 */
public class DocumentComment {

	/**
	 * 
	 * @param number1 First number to add
	 * @param number2 Second number to add
	 */
	public void addition(int number1,int number2) {
		
		int sum=0;
		sum=number1+number2;
		System.out.println("Sum of two numbers: "+sum);
	}
	/**
	 * @param args command line
	 */
	public static void main(String[] args) {
		DocumentComment doc=new DocumentComment();
		int number1=30;
		int number2=10;
		doc.addition(number1, number2);
	}

}
