package com.techelevator.models.product;

import java.math.BigDecimal;

	public class Chips extends Product{
		public Chips(String id, String name, BigDecimal price)
		{
			super(id, name, price);
			
		}
		
		@Override
		public String toString()
		{
			return "Crunch Crunch, Yum!";
		}
	}

