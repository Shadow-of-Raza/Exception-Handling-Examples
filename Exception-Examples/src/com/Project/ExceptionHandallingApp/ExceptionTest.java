package com.Project.ExceptionHandallingApp;

public class ExceptionTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution start...");
		try {
			int arr[] = {1, 2, 3, 4, 5};
			int l= arr.length;
			System.out.println(arr[10]);//Exception
			int i=10;
			int re = i/0;
			
			} 
	
		catch (ArrayIndexOutOfBoundsException  s) 
		{
			System.out.println(s.getMessage()); 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	
		System.out.println("Execution Stop...");
	}
}
