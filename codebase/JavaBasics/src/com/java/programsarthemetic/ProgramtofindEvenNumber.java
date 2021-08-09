package com.java.programsarthemetic;

import java.util.Scanner;

public class ProgramtofindEvenNumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number n upto which even number should be displayed");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println("Prime number upto "+n+" from 0 are :");
		for(int i = 0 ;i <= n ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
