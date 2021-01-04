package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		wordCount();

	}
	
	public static void wordCount()
	{
		String filePath = "alices_adventures_in_wonderland.txt";
		File theFile = new File(filePath);
//		
//		System.out.println(theFile.toString());
//		System.out.println(theFile.getAbsolutePath());
//		System.out.println(theFile.exists());
//		System.out.println("Directory: " + theFile.isDirectory());
//		System.out.println("File: " + theFile.isFile());
		
		Scanner scanner;
		
		try 
		{
			scanner = new Scanner(theFile);
			while(scanner.hasNextLine())
			{
				//Reading each line on the file
				String eachLine = scanner.nextLine();
				
				//Splitting the words by spaces
				String[] words = eachLine.split(" ");
				//return words.length;
				
				
				int totalWords = 0;
				for(int i = 1; i < words.length - 1; i++)
				{
					
					//words.length++;
					
				}
				System.out.println(totalWords);
			}
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}
