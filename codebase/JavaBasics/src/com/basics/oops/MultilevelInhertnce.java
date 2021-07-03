/*
 *Multi Level Inheritance 
 * 
 */
package com.basics.oops;

class B{

	void method1() {
		System.out.println("method1");
	}

}

class C extends B{
	void method2() {
		System.out.println("method2");
	}
}

class D extends B {
	void method3()
	{
		System.out.println("method3");
	}
}

public class MultilevelInhertnce extends C{

	public static void main(String[] args) {
		MultilevelInhertnce obj = new MultilevelInhertnce();
		obj.method1();
		obj.method2();

	}

}
