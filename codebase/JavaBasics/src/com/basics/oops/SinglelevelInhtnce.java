/*
 * Single Level Inheritance
 * 
 */
package com.basics.oops;

class A
{
	void method1()
	{
		System.out.println("method1");
	}
}




public class SinglelevelInhtnce extends A{

	public static void main(String[] args) {
		SinglelevelInhtnce obj = new SinglelevelInhtnce();
		obj.method1();
	}

}
