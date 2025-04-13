package com.practice.section;

class AA{
	void one()
	{
		System.out.println("Method inside one");
	}

	
}

class BB extends AA{
	   void two() 
	   {
	  
		System.out.println("Method inside two");

	   }
}
public class Casting {

	public static void main(String[] args) {
      
		AA object = new BB();//Implicit Upcasting
		object.one();
		
		BB object2 = (BB) new AA();//Explicit Downcasting ,its not permitted - you will end up with class cast exception during compiling i.e compile time error
		object2.two();
		object2.one();
		

	}

}
