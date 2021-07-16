/*
 * There are two types of casting
 * 1.Data Type Casting
 * 2.Class Casting
 * Here we see only of Data Type Casting which has two types
 * (a)Narrowing and (b) Widening
 * (a)Narrowing - when you cast a higher data type to lower data type ,its called narrowing 
 *    and normally we have to it explicitly 
 * (b)Widening - when you cast a lower data type to higher data type ,its called widening
 *    and normally complier doest and its called implicit casting   
 */
package com.basics.oops;

public class Typecasting {

	public static void main(String[] args) {
		//Widening
		byte b = 1;
		int c = (int)b;//Explicit widening
		int d = b;//Implicit widening
		
		System.out.println("Value after widening "+c+" and "+d);
		
		//Narrowing
		double e = 2.3;
		int i = (int)e;//explicit Narrowing
		System.out.println("Before Narrowing : "+e);
		System.out.println("After Narrowing : "+i);
		
		
 
	}

}
