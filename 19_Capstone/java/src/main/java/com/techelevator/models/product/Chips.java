package com.techelevator.models.product;

import java.math.BigDecimal;

	public class Chips extends Product{
		public Chips(String id, String name, BigDecimal price)
		{
			super(id, name, price, "Chip");
			
		}
		
		@Override
		public String getSound()
		{
			return "Crunch Crunch, Yum!";
		}
	}

