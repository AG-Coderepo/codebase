/*
 * 1.Interface is used to achieve pure abstraction ,since abstract methods can have fully qualified methods
 * 2.Interface can have only umimplimented methods means
 * (a)In Interface Vairables are static , final and public
 * (b)Methods are abstract
 * 3.Interface can inherit from each other using keyword extends
 * 4.Interface can be inherited by class using keyword impliments
 * 5.Mutiple inheritance is possible in Interfaces as compared to classes inwhich its not possible
 * 6.Interfaces helps to achieve loose coupling
 * 7.From Java 9 ,you can even have a private methods in Interface
 * 
 */
package com.basics.oops;
interface Smaple11 {
	
	 int a = 1;
	 int b =2;
	 void method1();
	 void method2();
		
	}
interface Sample33 extends Smaple11{
	int a=4;
	int b=6;
	void method3();
	void method4();
	
}
class Sample44 implements Sample33{

	@Override
	public void method1() {
		System.out.println("method1 implimneted from Interface Sample1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 implimented from Interface Sample1");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method implimented from Interface Sample3");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method implimented from Interface Sample3");
	}
	
}

public class Teachintrfce{

	public static void main(String[] args) {
		
		Sample44 obj = new Sample44();
		System.out.println("Value of integer a is : "+obj.a);
		
	}

	

}



