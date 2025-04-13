package com.practice.section;

public class Dog extends Animal{

	void makesound()
	{
		System.out.println("Dog Barks");
	}

	
	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.makesound();
		Animal obj = new Dog();
		obj.makesound();

	}

}
