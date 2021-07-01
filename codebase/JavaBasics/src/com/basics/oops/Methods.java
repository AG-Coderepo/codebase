/*
 * In Java everything is Objects
 * Objects has state and behavior
 * State is defined by Object declaration or initialization
 * Behavior of Object is defined by methods in Java
 */
package com.basics.oops;
public class Methods {
	static int a =10;
	static int b = 12;
	static int sum;
	  
	static int addTwonum(int c,int d)
		{
		return c+d;
	 }
	
	
	public static void main(String[] args) {
		
		
		Methods obj = new Methods();
	    sum = addTwonum(a,b);
		System.out.println("Value After Addition is : "+sum);
		
	}
	
	 	

}