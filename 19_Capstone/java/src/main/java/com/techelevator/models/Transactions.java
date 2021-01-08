package com.techelevator.models;

import java.math.BigDecimal;

import com.techelevator.models.file_io.FileProductLoader;
import com.techelevator.models.product.Product;

public class Transactions
{
	private BigDecimal money = BigDecimal.ZERO;
	
	public void add(BigDecimal amount)
	{
		money = money.add(amount);
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
		}
		
	    money = newCredit;
	}
}
