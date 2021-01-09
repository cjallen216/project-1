package com.techelevator.models;

import java.math.BigDecimal;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.file_io.FileProductLoader;
import com.techelevator.models.product.Product;
import com.techelevator.ui.UserInput;

public class Transactions
{
	private BigDecimal money = BigDecimal.ZERO;
	
	public void add(BigDecimal dollarCount)
	{
		money = money.add(dollarCount);
	}

	public BigDecimal getMoney()
	{
		return money;
	}
	
	public void purchase(Product product)
	{
		BigDecimal itemPrice = product.getPrice();
		BigDecimal newCredit = money.subtract(itemPrice);
		
		if(newCredit.compareTo(BigDecimal.ZERO) < 0)
		{
			// not enough credit
			System.out.println();
			needMoreMoney();
		}
		else
		{
			System.out.println(product.getSound());
		}
		
	    money = newCredit;
	}
	
	public void needMoreMoney()
	{
		System.out.println("Not enough money, Please add more!");
		UserInput.getPurchaseOptions();
	}
}
