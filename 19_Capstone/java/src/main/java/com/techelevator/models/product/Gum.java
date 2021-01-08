package com.techelevator.models.product;

import java.math.BigDecimal;

public class Gum extends Product{
	public Gum(String id, String name, BigDecimal price)
	{
		super(id, name, price, "Gum");
		
	}
	
	@Override
	public String getSound()
	{
		return "Chew Chew, Yum!";
	}
}
