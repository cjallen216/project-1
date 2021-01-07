package com.techelevator.models.product;

import java.math.BigDecimal;

public class Product
{
	private String id;
	private String name;
	private BigDecimal price;
	private String type;
	
	
	public Product(String id, String name, BigDecimal price, String type)
	{

		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public Product(String id, String name, BigDecimal price)
	{

		this.id = id;
		this.name = name;
		this.price = price;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public BigDecimal getPrice() {
		return price;
	}
	
	public String getType()
	{
		return type;
	}
	
	
	@Override
	public String  toString()
	{
		return id + " - " + name + " - $" + price;
	}
	
}
