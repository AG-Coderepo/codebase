package com.practice.section;


public class Animalss implements Animals2{

	public static void main(String[] args) {
		Animalss obj = new Animalss();
		obj.breed();
		obj.color();
		obj.sound();

	}

	@Override
	public void color() {
		System.out.println("Color of animal is Brown");
		
	}

	@Override
	public void sound() {
		System.out.println("Animal roars");
		
	}

	@Override
	public void breed() {
		System.out.println("Its a Tiger breed");
		
	}

}
