/*
 * 1.This keyword is used to differentiate between local and global variable when the variable names are
 * same
 * 2.This keyword can be used to call the constrcutor in the class and This keyword should always be in the 
 * first line of the constrcutor
 * 3.This key word can be used only inside the body of method and constrcutor .This keyword cannot be used
 * inside the static method
 * 
 * 
 */
package com.basics.oops;

public class Tiskeyword {

	int a;
	int b;
	int c;
	
	int addTwointgrs(int a,int  b)
	{
		this.a = a;
		this.b = b;
		c =this.a + this.b;
		return c;
	}
	
	public static void main(String[] args) {
		
        Tiskeyword obj = new Tiskeyword();
        System.out.println(obj.addTwointgrs(1, 2));
	}

}
