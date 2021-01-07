package com.techelevator.application;

import com.techelevator.models.Inventory;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private Inventory inventory = new Inventory();
	private UserInput input = new UserInput();
	
    public void run()
    {
    	
    	UserOutput.displayHomeScreen();
    	
        while(true)
        {
            String choice = "display";
            String option = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            	System.out.println(inventory.getProducts());
            	break;
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            	System.out.println("purchase");
            }
            else if(choice.equals("exit"))
            {
            	System.out.println("exit");
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
