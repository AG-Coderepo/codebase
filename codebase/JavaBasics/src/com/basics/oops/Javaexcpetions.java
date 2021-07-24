/**
 * Exceptions:
 * Event which disrupts the actual flow of the program is called exception
 * There are three kinds:
 * 1.Error - irrecoverable ,Does not occur in code Example -Out of Memory
 * 2.Checked Exception - Checked by compiler during compiler ,Example - FileNotfoundException ,Class Not Found Exception
 * 3.Unchecked Exception - Not Checked by compiler duirng compiling(i.e identified during Run time)
 *                         Example -ArrayIndexOutOfBound ,Arthemetic Exception 50/2.
 * 
 */
package com.basics.oops;

public class Javaexcpetions {

	public static void main(String[] args) {
		int a;
		try {
		 a = 10/0;

	}catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getLocalizedMessage());
	}finally {
		System.out.println("Finally Block executed");
	}

  }
}
