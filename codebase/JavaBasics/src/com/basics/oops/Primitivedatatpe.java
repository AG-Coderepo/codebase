package com.basics.oops;

public class Primitivedatatpe {

	public static void main(String[] args) {

		//There are eight primtive data types in Java
		//1 byte = 8 bits
		//4 bits = is called a nibble
		
        byte  a = 123;      //1 byte
        short b = 1234;     //2 byte
        int   c = 12345;    //4 byte
        long  d = 123456;   //8 byte
        float e = 1.2f;     //4 byte
        double f = 12.345;  //8 byte
        boolean g = true;   //1 bit
        char h = 'k';       //2 byte
     
        System.out.println("Eigth Primitive Data Types of Java are -"+"byte : "+a+" ,short : "+b+" ,int : "+c+" ,long : "+d+" \n"
        		+" ,float : "+e+" ,double : "+f+" ,boolean : "+g+" ,char : "+h);
        
	   System.out.println("Non-Primitve Data Types of Java are Strings ,Arrays and Classes");
	}

}
