/**
 * Constructors:
 * 1.Name should be same as class name
 * 2.Cannot have explicit return type
 * 3.Cannot be static ,final ,abstract and synchronized
 * 4.Can have a different access modifers like public,private,protected and  default(package level)
 * 5.Two types (a)Non-parameterized and (b)Parameterized constructor
 * 6.Constructor is called by new operator where as method is called by . operator
 * 7.Constructor is one time execution and Method is multiple time execution
 * 
 * 
 */
package com.basics.oops;

public class Constructors {

	Constructors()
	{
		System.out.println("Constructor is being called");
	}
	
	Constructors(int a,int b)
	{
		System.out.println("Values passeed are a:"+a+" and b: "+b);
	}
	
	public static void main(String[] args) {
   
         new Constructors();
		 new Constructors(1,2);
		 Constructors obj = new Constructors();
		 

	}

}
