/*
 * There are two kinds of class casting
 * 1.Upcasting
 * 2.Downcasting
 * Casting is nothing but converting object of one type to another
 * Upcasting is implicit
 * Downcasting is explicit
 * 
 */
package com.basics.oops;


class A1{
	
	int name = 10;
	void method1()
	{
		System.out.println("Method1 of Class A");
	}
}

class B2 extends A1{

	int i;
	void method2()
	{
		System.out.println("Method2 of Class B");
	}
}
public class Classcasting {

	
	public static void main(String[] args) {
		
		A1 obj = new B2();//Upcasting and its implicit casting
		obj.method1();
		System.out.println(obj.name);//only objects of parent class are accessible
		
	}

}
