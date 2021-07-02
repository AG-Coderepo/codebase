/*
 * Method Overlaoding is also called as Compile time polymorphism
 * 
 */
package com.basics.oops;

public class MethodOverlding {

	
	int addTwoNum(int arg1,int arg2)
	{
		return arg1+arg2;
	}
	
	double addTwoNum(double arg1,double arg2)
	{
		return arg1+arg2;
	}
	
	float addTwoNum(float arg1,float arg2)
	{
		return arg1+arg2;
	}
	
	
	//Adding two short will always result in int
	//Thought its odd ,this is the way it is defined in Java
	int addTwoNum(short arg1,short arg2)
	{
		return arg1+arg2;
	}
	public static void main(String[] args) {
		MethodOverlding obj = new MethodOverlding();
		System.out.println("Sum of two integers is : "+obj.addTwoNum(2, 3));
        System.out.println("Sum of two double is : "+obj.addTwoNum(2.3, 4.5));
        System.out.println("Sum of two float is : "+obj.addTwoNum(1.2f, 3.4f));
        System.out.println("Sum of two short is : "+obj.addTwoNum(0, 0));
	}

}
