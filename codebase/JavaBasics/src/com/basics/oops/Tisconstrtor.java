/*
 * 1.This keyword can be inside the constructor and method body only
 * 2.This keyword can used to call another constructor in same class
 * 3.This keyword should in the first line of the construcutor
 * 4.Constructor can only call one constructor at a time
 * 
 */
package com.basics.oops;

public class Tisconstrtor {

	
	Tisconstrtor()
	{
		System.out.println("Calling constructor");
	}
	
	Tisconstrtor(int a, int b){
	    this();
		System.out.println("Calling int construtor");
	}
	
	Tisconstrtor(double a,double b){
		this(1,2);
		System.out.println("Calling a double constructor");
	}
	
	Tisconstrtor(float a,float b)
	{
		this(1.2,2.3);
		System.out.println("Calling a float constructor");
	}
	public static void main(String[] args) {

        Tisconstrtor obj1 = new Tisconstrtor();
        new Tisconstrtor(1,2);
        new Tisconstrtor(2.3,4.5);
        new Tisconstrtor(1.2f,3.4f);

	}

}
