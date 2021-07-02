/**
 * 1.Polymorphism means more than one forms .When particular method has been called
 * It exibits different behaviour each time you call it with different
 * argumetns or intent
 *2.For Runtime Polymorphism IS-A Relationship is manadatory
 *3.Method Name should be same as in parent class
 *4.Method parameter should be same as in parent class
 *5.Method overriding is also called a Runtime Polymorphism in Java
 * 
 */
package com.basics.oops;

class Vehicle{
	
	void vehicleSound() {
		System.out.println("Vehicle makes vroom sound");

	}
}
public class MethodOverriding extends Vehicle {

	void vehicleSound()
	{
		System.out.println("Vehicle makes wroom sound");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
	    obj.vehicleSound();

	}

}
