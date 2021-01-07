package com.techelevator.application;

import com.techelevator.ui.UserInput;

public class VendingMachine 
{
    public void run()
    {
    	System.out.println();
    	
        while(true)
        {
            String choice = "display";
            String option = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            	System.out.println("display");
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
        }
    }
    
}
