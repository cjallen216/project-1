package com.techelevator.models.product;

import java.math.BigDecimal;

public class Drink extends Product{
	public Drink(String id, String name, BigDecimal price)
	{
		super(id, name, price, "Drink");
		
	}
	
	@Override
	public String getSound()
	{
		return "Glug Glug, Yum!";
	}
}
