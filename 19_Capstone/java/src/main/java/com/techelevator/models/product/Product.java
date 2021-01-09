package com.techelevator.models.product;

import java.math.BigDecimal;

public abstract class Product
{
	private String id;
	private String name;
	private BigDecimal price;
	private String type;
	private int quantity = 5;
	
	
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
	public Product(String id, String name, BigDecimal price, String type, int quantity)
	{

		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}
	


	public String getId()
	{
		return id;
	}


	public String getName()
	{
		return name;
	}


	public BigDecimal getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	public void purchase()
	{
		if(quantity != 0)
		{
			quantity--;
		}
		else 
		{
			System.out.println("SOLD OUT!");
		}
	}
	
	public abstract String getSound();
	
	@Override
	public String  toString()
	{
		return id + " - " + name + " - $" + price + " - " + type + " - amount remaining: " + quantity;
	}
	
	
}
