package com.techelevator.models.product;

import java.math.BigDecimal;

public class Candy extends Product {
	public Candy(String id, String name, BigDecimal price)
	{
		super(id, name, price);
		
	}
	
	@Override
	public String toString()
	{
		return "Munch Munch, Yum!";
	}
}
