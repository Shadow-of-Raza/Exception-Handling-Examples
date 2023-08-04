package com.Project.ExceptionHandallingApp;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try 
		{
			int [] ar = {1, 2, 3, 4, 5};
			ar[10] = 20;
			int i=10/0;
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) 
		{
				System.out.println(e);
		}
	}
}
    