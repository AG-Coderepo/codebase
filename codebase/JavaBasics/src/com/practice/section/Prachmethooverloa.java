package com.practice.section;

class A{
	
	
	void add(int k)
	{
		System.out.println("Adding a number : "+k);
	}
	
	void two_number(int k, int j)
	{
		System.out.println("Adding a number : "+k +" "+j);
	}
	
	void three_numbers(int k,int j,int l)
	{
		System.out.println("Adding a number : "+k+" "+j+" "+l);
	}
}

public class Prachmethooverloa {

	public static void main(String[] args) {
		A obj = new A();
		obj.add(10);
		obj.two_number(10, 12);
		obj.three_numbers(12, 13, 15);
		
	}

}
