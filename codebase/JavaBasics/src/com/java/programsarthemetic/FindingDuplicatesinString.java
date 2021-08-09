package com.java.programsarthemetic;

public class FindingDuplicatesinString {

	
	String name = "Athmeeya";
    char nam[] = name.toCharArray();

	public static void main(String[] args) {
		FindingDuplicatesinString obj = new FindingDuplicatesinString();
		int counter = 0;
		for(int i = 0;i < obj.nam.length ;i++)
		{
			
			for(int j = i+1;j < obj.nam.length ;j++)
			{
				if(obj.nam[i] == obj.nam[j])
				{
					counter = counter+1;
					System.out.println(obj.nam[i]);
				}
				
			}
		}
		

	}

}
