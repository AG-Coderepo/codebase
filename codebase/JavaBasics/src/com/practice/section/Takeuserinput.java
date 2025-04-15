package com.practice.section;

import java.util.Scanner;

public class Takeuserinput {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name below ");
		String stname = obj.next();
		
		
		System.out.println("Please enter your age below ");
		int value = obj.nextInt();
		
		System.out.println("Name entered is : "+stname);

		System.out.println("Age entered is  :"+value);
	}

}
