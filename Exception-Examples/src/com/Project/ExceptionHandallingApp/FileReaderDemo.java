package com.Project.ExceptionHandallingApp;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
	public static void main(String[] args) {
		FileReader fr=null;;
		try {
			fr = new FileReader
					("/Users/ansar/eclipse-workspace/ExceptionProject/src/myfile.txt");
			int i;
			while ((i=fr.read()) != -1) {
				System.out.print((char)i); // convert assci in charactor. 
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
