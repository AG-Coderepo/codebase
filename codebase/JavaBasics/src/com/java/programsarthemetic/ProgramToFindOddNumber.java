package com.java.programsarthemetic;

import java.util.Scanner;

public class ProgramToFindOddNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number N upto which Odd number need to be displayed");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println("Even numbers upto N from 0 are :");
		for(int i = 0 ;i <= n ;i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}

	}

}
