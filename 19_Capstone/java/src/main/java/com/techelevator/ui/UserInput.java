package com.techelevator.ui;

import java.math.BigDecimal;


import java.util.Scanner;

import com.techelevator.models.Transactions;

//THIS IS OUR PAIR PROGRAM CODE!!!

public class UserInput {
	private static Scanner scanner = new Scanner(System.in);
	
	private static Transactions transactions = new Transactions();
	
	public static String getHomeScreenOption()

	{
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
		
		BigDecimal money;
		//money = UserInput.getDollarCount();
		//save money to wallet
		//transactions.add(money);
		//System.out.println("Current Money added: $ " + transactions.getMoney());
		
		String selectedPurchaseOption = scanner.nextLine();
		String purchaseOption = selectedPurchaseOption.trim();
		
		if(purchaseOption.equals("1"))
		{
			return "Feed Money";
		}
		else if(purchaseOption.equals("2"))
		{
			return "Select Product";
		}
		else if(purchaseOption.equals("3"))
		{
			return "Exit Transaction";
		}
		else
		{
			return "";
		}
		
    }
    
    public static BigDecimal displayFeedMoneyOption()
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
    	
		// moneyOption = displayFeedMoneyOption();
		
		BigDecimal dollarCount = new BigDecimal(0);
		
		if(moneyOption.equals("1"))
		{
			BigDecimal dollarOne = new BigDecimal(1);
			dollarCount = dollarCount.add(dollarOne);
			return dollarCount;
		}
		else if(moneyOption.equals("2"))
		{
			BigDecimal dollarTwo = new BigDecimal(2);
			dollarCount = dollarCount.add(dollarTwo);
			return dollarCount;
		}
		else if(moneyOption.equals("3"))
		{
			BigDecimal dollarFive = new BigDecimal(5);
			dollarCount = dollarCount.add(dollarFive);
			return dollarCount;
		}
		else if(moneyOption.equals("4"))
		{
			BigDecimal dollarTen = new BigDecimal(10);
			dollarCount = dollarCount.add(dollarTen);
			return dollarCount;
		}
		else
		{
			return dollarCount;
		}
		
    }
    
    public static String selectProduct()
    {
    	System.out.println();
    	System.out.println("Which item would you like to purchase? (ex. C2)");
    	System.err.println();
    	
    	String selectedProductOption = scanner.nextLine();
		String productOption = selectedProductOption.trim().toUpperCase();
    	
		return productOption;
    }
		
		
}

