package com.practice.section;

class D{
	
	void methodD()
	{
		System.out.println("first method D executed");
	}
}


class E extends D{
	
	void methodE()
	{
		System.out.println("second method E executed");
	}
}

class F extends E{
	void maethodF()
	{
		System.out.println("third method F executed");
	}
}
public class Practiceinheritance {

	public static void main(String[] args) {
		
		F obj = new F();
        obj.maethodF();
        obj.methodD();
        obj.methodE();
     }

}