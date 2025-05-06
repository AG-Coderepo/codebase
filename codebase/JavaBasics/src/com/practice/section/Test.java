package com.practice.section;

abstract class Test1{
	
	abstract void one();
	
	abstract void two();
	
	void three()
	{
		System.out.println("Executing Test method of Three");
	}
	
}



public class Test extends Test1{

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.one();
		obj.two();
		obj.three();

	}

	
	void one() {
		System.out.println("Executing Test1");
		
	}

	
	void two() {
		System.out.println("Executing Test2");
		
	}

}
