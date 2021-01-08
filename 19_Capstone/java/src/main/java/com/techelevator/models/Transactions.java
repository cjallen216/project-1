package com.techelevator.models;

import java.math.BigDecimal;

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
	
}
