package com.java.programsarthemetic;

import java.util.Scanner;

public class ProhramToFindPrimenum {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  int i = 0;
		  int num = 0;
		  System.out.println("Enter the number n :");
		  int n = scanner.nextInt();
		  String primenumber ="";
		  scanner.close();
		  for(i = 0;i <= n ;i++) {
			  
			  int counter = 0;
			  for(num = i ;num >=1 ;num --)
			  {
				  if(i%num == 0)
				  {
					  counter = counter+1;
				  }
			  }
			  if(counter == 2) {
				  primenumber = primenumber+i+" ";
			  }
		  }
		  System.out.println("Prime number form 1 to n are :");
		  System.out.println(primenumber);
	}  
	
	
}	