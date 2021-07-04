/*
 * 1.Abstract class has been created to achieve Abstraction
 * 2.Its not mandatory for Abstraction Class to have Abstract method
 * 3.But If there is any method which is Abstract ,then class has to be declared with the keyword abstract
 * 4.If any class in-hertis Abstract class ,then all the abstract methods has to be implimented
 * 5.Abstract class can never have the instation of object or instance variable can never be created to access
 * abstract class since abstract methods cannot be callled using the object created.How ever its static members
 * can be accessed.
 * 6.Abstract class can have abstract method/complete methods /both
 * 7.Abstract method is the method without the body of the method.
 * 
 * 
 */
package com.basics.oops;

abstract class Sample1{
	
    abstract void method1();
	
	void method2()
	{
		System.out.println("Method Two");
	}
	

	static void method3()
	{
		System.out.println("Method Three");
	}
}

public class Abstrtclas{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1.method3();

	   }
	
}
