package com.techelevator.application;

import java.math.BigDecimal;

import com.techelevator.models.Change;
import com.techelevator.models.Inventory;
import com.techelevator.models.Transactions;
import com.techelevator.models.file_io.Logger;
import com.techelevator.models.product.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private Inventory inventory = new Inventory();
	private Transactions transactions = new Transactions();
	
	private Logger errorLogger = new Logger("errors");
    private Logger activityLogger = new Logger("logs");
	
    public void run()
    {
    	
    	while(true)
        {
    	UserOutput.displayHomeScreen();        
        String option = UserInput.getHomeScreenOption();

            if(option.equals("display"))
            {
                // display the vending machine slots
            	//System.out.println(inventory.getProducts());
            	UserOutput.displayInventory(inventory);
            	//break;
            }
            else if(option.equals("purchase"))
            {
               purchaseScreen();
           
            }
            else if(option.equals("exit"))
            {
            	System.out.println("Thanks for your business!");
            	// good bye
                break;
            }
            else
            {
                // invalid option try again
                UserOutput.displayMessage("You selected an invalid option:");
            }
        }
    }
    public void purchaseScreen()
    {
    	while(true)
        {
    		String option = UserInput.getPurchaseOptions();
    		BigDecimal money;
    		
    		if (option.equals("Feed Money"))
    		{
    			money = UserInput.displayFeedMoneyOption();
    			//save money to wallet
    			transactions.add(money);
    			System.out.println(transactions.getMoney());
    		}
    		else if (option.equals("Select Product"))
    		{
    			selectProduct();
    		}
    		else if (option.equals("Exit Transaction"))
    		{
    			// return change to customer
    			Change change = new Change();
    			money = transactions.getMoney();
    			System.out.println("Transaction complete, your change amount is: " + change.getChange(money));
    			
    			
    			break;
    		}
     	//UserOutput.displayInventory(inventory);
     	// make a purchase
        //System.out.println(UserInput.getPurchaseOptions());
        //System.out.println(UserInput.displayFeedMoneyOption());
        }
    }
    
    public void selectProduct()
    {
    	UserOutput.displayInventory(inventory);
		try
		{
		// get product selection
		String idString = UserInput.selectProduct();
		
		// find product by ID
		Product product = inventory.getProductById(idString);
		System.out.println(product.toString());
		
		//insert soldOut() method
		// try to purchase (do they have enough money?) - if no, ask for more
		
			transactions.purchase(product);
			product.purchase();
			product.soldOut();
			// get sound
			System.out.println(product.getSound());
			activityLogger.logMessage("Product Purchased " + product);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
    }
    
}
