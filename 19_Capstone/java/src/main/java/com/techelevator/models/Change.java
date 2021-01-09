package com.techelevator.models;

import java.math.BigDecimal;

public class Change
{
	private int quarters = 0;
	private int dime = 0;
	private int nickels = 0;
	private double balance = 0;
	
	public String getChange(BigDecimal balanceFromOther)
	{
		Transactions transactions = new Transactions();
		balance = transactions.getMoney().doubleValue();
		
		
		//if(newCredit.compareTo(BigDecimal.ZERO) < 0)
		//balance.compareTo((BigDecimal.ZERO)
		
	while (balance > 0)
	{
		if (balance >= .25)
		{
			quarters++;
			balance -= .25;
		}
		else if (balance >= .10)
		{
			dime++;
			balance -= .10;
		}
		else if (balance >= .05)
		{
			nickels++;
			balance -= .05;
		}	
	}
	return ("Your change is " + quarters + " quarters, " + dime + " dimes, " + nickels + " nickels.");
	}
	
}
