package com.techelevator.ui;

import java.math.BigDecimal;
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

    public static String getPurchaseOptions()
    {
    	System.out.println();
		System.out.println("Please select the following Purchase options!");
		System.out.println();
		
		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		System.out.println();
		
		String selectedPurchaseOption = scanner.nextLine();
		String purchaseOption = selectedPurchaseOption.trim();
		
		if(purchaseOption.equals("1"))
		{
			return "Feed Money";
		}
		else if(purchaseOption.equals("2"))
		{
			return "select Product";
		}
		else if(purchaseOption.equals("3"))
		{
			return "exit transaction";
		}
		else
		{
			return "";
		}
		
    }
    
    public static int getFeedMoneyOption()
    {
    	System.out.println();
		System.out.println("Please select the following dollar amount!");
		System.out.println();
		
		System.out.println("(1) $1");
		System.out.println("(2) $2");
		System.out.println("(3) $5");
		System.out.println("(4) $10");
		System.out.println();
		
		String selectedMoneyOption = scanner.nextLine();
		String moneyOption = selectedMoneyOption.trim();
		
		int dollarCount = 0;
		
		if(moneyOption.equals("1"))
		{
			dollarCount++;
			return dollarCount;
		}
		else if(moneyOption.equals("2"))
		{
			dollarCount+= 2;
			return dollarCount;
		}
		else if(moneyOption.equals("3"))
		{
			dollarCount+= 5;
			return dollarCount;
		}
		else if(moneyOption.equals("4"))
		{
			dollarCount+= 10;
			return dollarCount;
		}
		else
		{
			return dollarCount;
		}
    }
}

