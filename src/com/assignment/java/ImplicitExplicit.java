/**
 * 
 */
package com.assignment.java;

/**
 * @author lenovo
 *
 */
public class ImplicitExplicit {

	
	public void implicit() { // this method will print implicit casting
		System.out.println("Implicit Casting"); // Implicit casting converting lower datatype to higher datatype
		byte p = 12;  
		short q = p;
		int r = q;  
		long s = r; 
		float t = s; 
		double u = t; 
		System.out.println("Byte value : "+p);  
		System.out.println("Short value : "+q);  
		System.out.println("Int value : "+r);  
		System.out.println("Long value : "+s);  
		System.out.println("Float value : "+t);  
		System.out.println("Double value : "+u);
		System.out.println("");
	}
	
	public void explicit() {// this method will print explicit casting

		System.out.println("Explicit Casting"); // Explicit casting converting higher datatype to lower datatype
		double a=12.00;
		float b=(float)a;
		long c=(long)b;
		int d=(int)c;
		short e=(short)d;
		byte f=(byte)e;
		System.out.println("Double value : "+a);
		System.out.println("Float value : "+b);  
		System.out.println("Long value : "+c);  
		System.out.println("Int value : "+d);   
		System.out.println("Short value : "+e); 
		System.out.println("Byte value : "+f);
	}
	
	public static void main(String[] args) {
		
		ImplicitExplicit impliexpi=new ImplicitExplicit(); // creating object of the class
		impliexpi.implicit();
		impliexpi.explicit();		
	}

}
