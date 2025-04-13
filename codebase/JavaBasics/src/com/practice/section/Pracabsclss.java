package com.practice.section;

abstract class animall{
	abstract void sound();
	abstract void color();
}

abstract class dogg extends animall{
	void sound()
	{
		System.out.println("Dog barks");
	}
	abstract void color();
}

class labb extends dogg{

	
	void color() {
		System.out.println("Dog color is Cream color");
		
		
	}
	
}


public class Pracabsclss {

	public static void main(String[] args) {
		labb object = new labb();
		object.sound();
		object.color();
	}

}
