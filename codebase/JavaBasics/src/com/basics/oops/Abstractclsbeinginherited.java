package com.basics.oops;

abstract class Sample2{
	
    abstract void method1();
	
	void method2()
	{
		System.out.println("Method Two");
	}
	

	static void method3()
	{
		System.out.println("Method Three");
	}
}

public class Abstractclsbeinginherited extends Sample2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstractclsbeinginherited obj = new Abstractclsbeinginherited();
		obj.method1();
		obj.method2();
		Sample2.method3();

	}

	@Override
	//Abtractmethod implimented
	void method1() {
		System.out.println("Method One");
		
	}

}
