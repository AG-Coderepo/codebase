package com.practice.section;
public class Pracconstrucal {
	
	Pracconstrucal()
	{
		System.out.println("Hello First Constructor");
	}

	Pracconstrucal(int arg1)
	{
		this();
		System.out.println("Int value passed is :"+arg1);
	}
	
	Pracconstrucal(double arg1)
	{
		this(3);
		System.out.println("Double value passed is : "+arg1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pracconstrucal obj = new Pracconstrucal(12.345);
	}

}
