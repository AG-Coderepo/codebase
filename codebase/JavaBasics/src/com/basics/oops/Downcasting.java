package com.basics.oops;
class A3{
	
	int name = 10;
	void method1()
	{
		System.out.println("Method1 of Class A");
	}
}

class B3 extends A3{

	int i=5;
	void method2()
	{
		System.out.println("Method2 of Class B");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		B3 obj = (B3)new A3();//Explicit Casting
		obj.method1();
		obj.method2();
		System.out.println(obj.name);
		System.out.println(obj.i);

	}

}
