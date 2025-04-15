package com.practice.section;

import java.util.Arrays;

public class Handlingarrays {

	public static void main(String[] args) {
		
		//int[] array1 = null;
		int[] array2 = new int[5];
		String[] array3 = {"Athmeeya","Raju","Manu"};
		
//		array1[0] =1;
//		array1[1] =2;
//		array1[2] =3;
//		array1[3] =4;
		
		array2[0]=10;
		array2[1]=30;
		array2[2]=20;
		array2[3]=50;
		array2[4]=5;
		
		
//		for(int var1 : array1)
//		{
//			System.out.println(var1);
//		}
//		
		for(int var2 : array2)
		{
			System.out.println(var2);
		}
		
		for(String cha : array3)
		{
			System.out.println(cha);
		}
		
		Arrays.sort(array2);
		
		for(int var : array2)
		{
			System.out.println(var);
		}
		
	
	}

}
