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
	
	
	
//	public BigDecimal getPruchaseAmount()
//	{
//		BigDecimal itemPrice = FileProductLoader.price;
//	    BigDecimal change = money.subtract(itemPrice);
//		return change;
//	}
}
