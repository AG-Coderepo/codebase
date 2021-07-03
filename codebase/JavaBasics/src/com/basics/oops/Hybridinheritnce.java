/*
 * Hybrid Inheritance
 * 
 */
package com.basics.oops;

class B1{

	void method1() {
		System.out.println("method1");
	}

}

class C1 extends B1{
	void method2() {
		System.out.println("method2");
	}
}

class D1 extends B1 {
	void method3()
	{
		System.out.println("method3");
	}
}

class E1 extends D1{
	void method4()
	{
		System.out.println("method4");
	}
}

public class Hybridinheritnce{

   public static void main(String[] args) {
	   E1 obj1 = new E1();
	   obj1.method1();
	   obj1.method3();
	   obj1.method4();
	   
	   C1 obj2 = new C1();
	   obj2.method1();
	   obj2.method2();
	   
			
		}

}
	

