package com.practice.section;

public class Practicethismethodoverlo {

	
	Practicethismethodoverlo()
	{
		System.out.println("Calling the No arg constructor");
	}
	
	Practicethismethodoverlo(int arg1)
	{
		System.out.println("Callng the arg1 constructor :"+arg1);
	}
	
	Practicethismethodoverlo(int arg1 ,double arg2)
	{
		System.out.println("Calling the two arg constructor "+arg1+" "+arg2);
	}
	
	Practicethismethodoverlo(int arg1,String arg3)
	{
		System.out.println("Calling the string arg constructor : "+arg1+" "+arg3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practicethismethodoverlo object = new Practicethismethodoverlo();
		Practicethismethodoverlo Object2 = new Practicethismethodoverlo(10);
		Practicethismethodoverlo object3 = new Practicethismethodoverlo(12,23.456);
		Practicethismethodoverlo object4 = new Practicethismethodoverlo(23,"Athmeeya");
	}

}
