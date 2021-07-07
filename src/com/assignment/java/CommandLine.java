package com.assignment.java;

public class CommandLine {

	public static void main(String[] args) {
		
		System.out.println(args[0]);//this will retrieve the element which is stored in 0th index
		System.out.println(args[1]);//this will retrieve the element which is stored in 1st index
		System.out.println(args[2]);//this will retrieve the element which is stored in 2nd index
		
		System.out.println("Number of command line arguments are:"+args.length);
		
		for(String command:args) {//printing all the command line arguments
			System.out.println(command);
		}
	}

}
