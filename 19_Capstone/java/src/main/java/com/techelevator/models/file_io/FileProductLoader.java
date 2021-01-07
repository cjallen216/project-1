package com.techelevator.models.file_io;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.models.product.Product;

public class FileProductLoader
{
	public List<Product> getProducts()
	{
		List<Product> products = new ArrayList<Product>();
		File productsPath = new File("VendingMachine.csv");
		
		try (Scanner fileScanner = new Scanner(productsPath))
		{
			while (fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				String[] parts = line.split("|");
				
				String id = parts[0];
				String name = parts[1];
				BigDecimal price = new BigDecimal(parts[2]);
				String type = parts[3];
				
				Product product = new Product(id, name, price, type);
				
				products.add(product);
			}
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		return products;
	}
}
