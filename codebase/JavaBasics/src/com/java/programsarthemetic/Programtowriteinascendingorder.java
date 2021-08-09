package com.java.programsarthemetic;

import java.util.ArrayList;

public class Programtowriteinascendingorder {

	public Programtowriteinascendingorder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		int[] arr = new int[] {1,5,7,3,9,23,67};
        int temp ;
        for(int i= 0;i < arr.length ;i++) {
        	System.out.println(arr[i]);
        }
        //Sorting in ascending order
        for(int i = 0;i < arr.length ;i++)
        {
        	for(int j = i+1 ;j < arr.length ;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        System.out.println("After Sorting in ascending Order");
        for(int i = 0 ;i < arr.length ;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
