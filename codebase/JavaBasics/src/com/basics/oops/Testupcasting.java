package com.basics.oops;


interface One{
	
	public static final int i = 1;
	public static final int k = 2;
	public static final String name = "Athmeeya";
    void methodTest1();
}

class Twooo implements One
{
	String book="Bookie";
	public void methodTest1() {
		System.out.println("Method of statement Twooo");
		
	}
}




public class Testupcasting {

	public Testupcasting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		One Obj = new Twooo();//Upcasting from interface ,same concept is used in Webdriver driver = new FirefoxDriver();
		Obj.methodTest1();
		System.out.println(Obj.i);
		System.out.println(Obj.k);
		
		
		

	}

}
