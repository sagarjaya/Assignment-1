package com.assignment.java;
public class DefaultValues {
	
	int number ; //integer type
	double doublenumber;  //double type
	float floatnumber;  //float type
	long longnumber;  //long type
	String str;  //string type
	boolean var;  //boolean type
	byte byt;  //byte type
	
	public void values() {
		System.out.println("Default values of all primitive types"); // Default values of primitive data type listed below
		System.out.println("Integer:"+number);
		System.out.println("Double:"+doublenumber);
		System.out.println("Float:"+floatnumber);
		System.out.println("Long:"+longnumber);
		System.out.println("String:"+str);
		System.out.println("Boolean:"+var);
		System.out.println("byte:"+byt);
	}
	
	public static void main(String[] args) {	
		DefaultValues dv=new DefaultValues();//creating object of the class
		dv.values();
	}

}
/* 
 * 2nd approch
 * 
	static int number ; //integer type
	static double doublenumber;  //double type
	static float floatnumber;  //float type
	static long longnumber;  //long type
	static String str;  //string type
	static boolean var;  //boolean type
	static byte byt;  //byte type
	
	public static void main(String[] args) {
	
		System.out.println("Default values of all primitive types"); // Default values of primitive data type listed below
		System.out.println("Integer:"+number);
		System.out.println("Double:"+doublenumber);
		System.out.println("Float:"+floatnumber);
		System.out.println("Long:"+longnumber);
		System.out.println("String:"+str);
		System.out.println("Boolean:"+var);
		System.out.println("byte:"+byt);
	}
}
*/
	
