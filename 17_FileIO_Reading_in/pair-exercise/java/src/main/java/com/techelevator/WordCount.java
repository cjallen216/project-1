package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)
	{
		wordCount();
	}
	
	public static void wordCount()
	{
		String filePath = "alices_adventures_in_wonderland.txt";
		File theFile = new File(filePath);
		
//		System.out.println(theFile.toString());
//		System.out.println(theFile.getAbsolutePath());
//		System.out.println(theFile.exists());
//		System.out.println("Directory: " + theFile.isDirectory());
//		System.out.println("File: " + theFile.isFile());
		
		int totalWords = 0;
		int totalSentences = 0;
				
		Scanner scanner;
		
		try 
		{
			scanner = new Scanner(theFile);
			while(scanner.hasNextLine())
			{
				//Reading each line on the file
				String eachLine = scanner.nextLine();
				
				// if each line is NOT empty
				if (!eachLine.isEmpty())
				{
					//Splitting the words by spaces - "\\s+" is code for white spaces 
					String[] words = eachLine.split("\\s+");
					totalWords += words.length;
				}	
				if (eachLine.contains(".") || eachLine.contains("?") || eachLine.contains("!"))
				{
					// add a new sentence to the total
					totalSentences++;
				}
				
				//int totalWords = 0; <-- moved before the try-catch
				//for(int i = 1; i < words.length - 1; i++) <-- not needed
			}
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Your file does not exist");
		}
		
		// print out the answers after the try-catch
		System.out.println("Word Count: " + totalWords);
		System.out.println("Sentence Count: " + totalSentences);
	}

}
