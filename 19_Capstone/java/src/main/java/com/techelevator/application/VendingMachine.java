package com.techelevator.application;

public class VendingMachine 
{
    public void run()
    {
        while(true)
        {
            String choice = "display";

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
