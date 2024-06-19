package TP_Cinema;
import java.util.Scanner;
public class Seat_Reserve extends Payment
{
	
	
	public static void Seat()
	{
	Scanner input = new Scanner(System.in);
        int[][] seats = new int[5][10];
        int totalBooked = 0;

        Seat_Reserve Tix= new Seat_Reserve();
        int numOfTickets=0;
		double price=350;
		
	while (true) 
	     {
        for (int row = 0; row < 5; row++) 
        {
            for (int col = 0; col < 10; col++) 
            {
                seats[row][col] = 0;
            }
        }

        
        	System.out.print("Enter the number of tickets you want to purchase: ");
            numOfTickets = input.nextInt();
            if(numOfTickets>50 ||numOfTickets<0) //debug
            {
            	System.err.println("Try again");
            	continue;
            }
            else {
        	System.out.print("----------------------------------------------------------");
            System.out.println("\nAvailable Seats:");
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 10; col++) {
                    char seatLabel = (char) ('A' + row);
                    String status = seats[row][col] == 0 ? " " : "X";
                    System.out.print(seatLabel + "" + (col + 1) + " [" + status + "] ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------------");
            }
            
           
        
            for (int i = 0; i < numOfTickets; i++) 
            {
            	while (true)
            	{
                System.out.print("\nEnter seat to book (e.g., A1): ");
                String seatInput = input.next().toUpperCase(); 

                if(seatInput.matches("^[A-E](10|[1-9])$"))
                {
                char seatLabel = seatInput.charAt(0); 
                int row = seatLabel - 'A'; 
                int col = Integer.parseInt(seatInput.substring(1)) - 1; 

                if (row < 0 || row >= 5 || col < 0 || col >= 10) {
                    System.err.println("Invalid seat selection. Please try again.");
            
                    continue;
                   
                } else if (seats[row][col] == 1) {
                    System.err.println("Sorry, seat " + seatInput + " is already booked.");
                   
                    continue;
                   
                } 
                else 
                {
                	seats[row][col] = 1;
                    System.out.println("Seat " + seatInput + " booked successfully!");
                    totalBooked++;
                    break;
                }
                }
                else 
                {
                	System.err.println("Invalid input. Please choose from the available seats only.");
                	continue;
                }
                
            }
            }
          
      
               System.out.println("\nTotal tickets booked: " + totalBooked);
              
                System.out.print("Do you want to change seats you had picked? (yes/no): ");
                String continueBooking = input.next().toLowerCase();
                if (continueBooking.equals("yes")) 
                {
                	totalBooked-=totalBooked;
                    continue;
                } 
                else 
                {
                	System.out.println("Thankyou!");
                	System.out.print("----------------------------------------------------------");
                    System.out.println("\nReserved Seats:");
                    for (int row = 0; row < 5; row++) 
                    {
                        for (int col = 0; col < 10; col++) 
                        {
                            char seatLabel = (char) ('A' + row);
                            String status = seats[row][col] == 0 ? " " : "X";
                            System.out.print(seatLabel + "" + (col + 1) + " [" + status + "] ");
                            
                        }
                        System.out.println();
                    }
                    System.out.println("----------------------------------------------------------");
                    break;
                    
                }   
        }
	Payment.Price(price);
	 
	
 } 
}



	
	



