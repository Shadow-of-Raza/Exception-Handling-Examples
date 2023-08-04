package com.Project.ExceptionHandallingApp;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertetest 
{
	public static void main(String[] args) 
	{
		FileReader f=null;
		try {
			
			f=new FileReader("/Users/ansar/eclipse-workspace/ExceptionProject/src/file.txt");
		
		int i;
		while ((i=f.read()) != -1) 
		{
			System.out.print((char)i);
		}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
			f.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	

}
