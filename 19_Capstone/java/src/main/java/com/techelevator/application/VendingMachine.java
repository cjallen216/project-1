package com.techelevator.application;

import com.techelevator.models.Inventory;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private Inventory inventory = new Inventory();
	//private UserInput input = new UserInput();
	
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
               while(true)
               {
            	UserOutput.displayInventory(inventory);
            	// make a purchase
               System.out.println(UserInput.getPurchaseOptions());
               System.out.println(UserInput.displayFeedMoneyOption());
               }
           
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
    
}
