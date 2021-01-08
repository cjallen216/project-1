package com.techelevator.application;

import java.math.BigDecimal;

import com.techelevator.models.Inventory;
import com.techelevator.models.Transactions;
import com.techelevator.models.product.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private Inventory inventory = new Inventory();
	private Transactions transactions = new Transactions();
	
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
    		
    		if (option.equals("Feed Money"))
    		{
    			BigDecimal money = UserInput.displayFeedMoneyOption();
    			//save money to wallet
    			transactions.add(money);
    			System.out.println(transactions.getMoney());
    		}
    		else if (option.equals("Select Product"))
    		{
    			UserOutput.displayInventory(inventory);
    			
    			// get product selection
    			String idString = "A1";
    			
    			// find product by ID
    			Product product = inventory.getProductById(idString);
    			System.out.println(product.toString());
    			System.out.println(product.getSound());
    			// try to purchase (do they have enough money?) - if no, ask for more 
    			// get sound
    		}
    		else if (option.equals("Exit Transaction"))
    		{
    			// return change to customer
    			break;
    		}
     	//UserOutput.displayInventory(inventory);
     	// make a purchase
        //System.out.println(UserInput.getPurchaseOptions());
        //System.out.println(UserInput.displayFeedMoneyOption());
        }
    }
    
}
