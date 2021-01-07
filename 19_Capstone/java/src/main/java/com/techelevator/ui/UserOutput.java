package com.techelevator.ui;

import com.techelevator.models.Inventory;
import com.techelevator.models.product.Product;

public class UserOutput
{
	public static void displayInventory(Inventory inventory)
	{
		System.out.println();
		System.out.println();
		System.out.println("*****************");
		System.out.println("    Products");
		System.out.println("*****************");
		System.out.println();
		
		for(Product product: inventory.getProducts())
		{
			System.out.println(product.toString());
		}
		System.out.println();
	}
	
	public static void displayHomeScreen()
	{
		//clearScreen();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                      Home");
		System.out.println("***************************************************");
		System.out.println();
	}
	
	public static void displayMessage(String message)
	{
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
