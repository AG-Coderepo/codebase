package com.practice.section;

class Employee{
	private String name ;
	
	public String setname(String name)
	{
		return this.name = name;
	}
	
	public void getname()
	{
		System.out.println("Name of the Employee is : "+name);
	}
	
	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Employee obje = new Employee();
		obje.setname("Athmeeya");
		obje.getname();

	}

}
