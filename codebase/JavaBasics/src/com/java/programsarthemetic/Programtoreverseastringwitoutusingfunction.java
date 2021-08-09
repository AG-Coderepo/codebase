package com.java.programsarthemetic;

public class Programtoreverseastringwitoutusingfunction {

	public static void main(String[] args) {
		
		
		String s = "Athmeeya";
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		for(int i = s.length() ;i>=1;i--) {
			System.out.println(s.charAt(i-1));
		}

	}

}
