/**
 * 
 * Class is a template which defines the state and behavior of an object
 * 
 */
package com.basics.oops;

public class Cls {

	int a =10;
	String name = "Athmeeya";
	void dipName()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Cls obj = new Cls();
		System.out.println(obj.a);
		obj.dipName();
		
	}

}
