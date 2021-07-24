package com.basics.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ReadWrite{
	
	
	void write(int i) throws IOException
	{
		@SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream("C:\\Users\\nra4\\git\\repository\\codebase\\JavaBasics\\src\\com\\basics\\oops\\Read.txt");
	    fos.write(i);
	}
	
	
	@SuppressWarnings("resource")
	void read() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\nra4\\git\\repository\\codebase\\JavaBasics\\src\\com\\basics\\oops\\Read.txt");
	    System.out.println(fis.read());   
	}
	
	
}

public class Testxception {

	public static void main(String[] args) throws IOException {
		ReadWrite obj = new ReadWrite();
		try {
			obj.write(100);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			obj.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Complete Programs is executed without any interruption");
	}

}
