package com.practice.section;

class AA{
	void one()
	{
		System.out.println("Method inside one");
	}

	
}

class BB extends AA{
	   int k;
	   void two() 
	   {
	  
		System.out.println("Method inside two");

	   }
}
public class Casting {

	public static void main(String[] args) {
      
				
		AA object = new BB();//Implicit Upcasting
		object.one();
		BB object3 = new BB();
		object3.k = (int) 23.456;
		
//		BB object2 = (BB) new AA();//Explicit Downcasting ,its not permitted - you will end up with class cast exception during compiling i.e compile time error
//		object2.two();
//		object2.one();
		

	}

}
