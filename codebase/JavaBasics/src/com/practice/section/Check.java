package com.practice.section;

public class Check {

	public String reverseString(String a)
	{
		 
		 String b="";
		System.out.println(a.length());
		for(int i =  a.length()-1;i >= 0;i--)
		{
			System.out.println(a.charAt(i));
			b = ""+a.charAt(i);

		}
		
		return b;
	}

}
