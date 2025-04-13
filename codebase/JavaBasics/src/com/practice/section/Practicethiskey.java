package com.practice.section;

public class Practicethiskey {

	int i;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Practicethiskey obj = new Practicethiskey();
		obj.setValue(10);
		obj.showValue();
        
	}
	
	void setValue(int k)
	{
		i = k;
	}
	
	void showValue()
	{
		System.out.println("Value of i is : "+i);
	}
}
