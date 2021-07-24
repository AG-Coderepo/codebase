/*
 * Customized Exception:
 * Is nothing but class extending class Exception
 * 
 */
package com.basics.oops;

class InvalidAgeException extends Exception {

	/**
	 * Serialization and Deserialization ID
	 */
	private static final long serialVersionUID = -7106132779770881522L;

	InvalidAgeException(String s) {
		super(s);
	}
}

public class Customeexception {

	static void age(int num) throws InvalidAgeException {
		if (num < 18) {
			throw new InvalidAgeException("Not a valid age");
		} else {
			System.out.println("Valid Age");
		}
	}

	public static void main(String[] args) {

		try {
			Customeexception.age(1);
		} catch (InvalidAgeException e) {

			e.printStackTrace();
		}

		System.out.println("Rest of the code");

	}

}
