package com.techelevator.ui;

import java.util.Scanner;

public class UserInput {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println();
		System.out.println("Please select the following options!");
		System.out.println();
		
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		System.out.println();
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim();
		
		if(option.equals("1"))
		{
			return "display";
		}
		else if(option.equals("2"))
		{
			return "purchase";
		}
		else if(option.equals("3"))
		{
			return "exit";
		}
		else
		{
			return "";
		}
		
	}
}
