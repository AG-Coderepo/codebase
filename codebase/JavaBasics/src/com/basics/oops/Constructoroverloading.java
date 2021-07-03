/**
 * Constructor Overloading
 * Constructor Overriding is not possible since for inhertiance class name should be different
 * and when class names are different constructor name is different and hence oveririding is not possible 
 * 
 */
package com.basics.oops;

public class Constructoroverloading {

	int k;
	int j;
	double d;
	
	Constructoroverloading()
	{
		System.out.println("Calling a first constructor");
	}
	
	Constructoroverloading(int arg1 , int arg2)
	{
	   System.out.println("Calling a second constructor and assiging a value to k and j");
	   k = arg1;
	   j = arg2;
	   System.out.println("Values after assigning values to k and j : "+k+" and "+j);
	}
	
	Constructoroverloading(double arg1)
	{
		System.out.println("Calling a third constructor and assigning a value to d");
		d = arg1;
		System.out.println("Values after assiging values to d : "+d);
	}
	
	public static void main(String[] args) {
		
		Constructoroverloading obj1 = new Constructoroverloading();
		Constructoroverloading obj2 = new Constructoroverloading(2,3);
		Constructoroverloading obj3 = new Constructoroverloading(4.5);

	}

}
