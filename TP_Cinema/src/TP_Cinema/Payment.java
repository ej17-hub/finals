package TP_Cinema;
import java.util.*;
public class Payment {
	public static void Price(double totalCost) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Total cost to be paid: " + totalCost);

        System.out.println("PAYMENT METHOD");
        System.out.println("- Cash \n- Online payment ");
        while (true) 
        {
        System.out.print("Select payment method ['C' for Cash and 'O' for Online payment]: ");
        String pay = scanner.nextLine().toUpperCase();
        double amount, finalBal;
        
       
        
            
            
            if (pay.matches("C")) 
            {
            	System.out.println("Enter the amount: ");
                amount = scanner.nextInt();
                finalBal = amount - totalCost;

                if (amount < totalCost) 
                {
                    System.err.println("Insufficient funds. Try again.");
                    continue;
                    
                } 
                else 
                {
                    System.out.println("Your change is: " + finalBal);
                    break;
                }

            }
            
            if (pay.matches("O")) 
            {
                System.out.println("You have selected Online payment. Please proceed with the online payment process.");
                System.out.println("\nScan the G-cash QR Code or you can send it to `0925241241`");
                System.out.println  ("\n#######    #   # ########");
    			System.out.println  ("#     # #  #     #      #");
    			System.out.println  ("# ### #  #       # #### #");
    			System.out.println  ("# ### #   #      # #### #");
    			System.out.println  ("#     # #  #     #      #");
    			System.out.println  ("#######  #  #    ########");
    			System.out.println  ("       ########    ####  ");
    			System.out.println  ("######## ####### ## # # #"); 
    			System.out.println  ("#######    #   # ########");
    			System.out.println  ("#     # #  #     #      #");
    			System.out.println  ("# ### #  #  ###  # #### #");
    			System.out.println  ("# ### #  #  #### # #### #");
    			System.out.println  ("#     # #  #     #      #");
    			System.out.println  ("#######  #  #    ########");		

                break;
            } 
            else 
            {
                System.out.println("Invalid selection. Please try again.");
              continue;
            }
        }
        
        Receipt.resibo(null, null);
       
        
    }
}


   

