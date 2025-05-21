package com.practice.section;

public class Birlasoft {

	public static void main(String[] args) {


		String str = "AABC EF GHIJ";
		Check util = new Check();
		String revStr = util.reverseString(str);
		System.out.println(revStr);
		//Expected output of revStr is "JIH GF ECBA"e
		TestT obj = new TestT();
		obj.disp();

	}
		
}


class TestT{
	
	public void disp()
	{
		System.out.println("Executing display method");
	}
}