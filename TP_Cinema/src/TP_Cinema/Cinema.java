package TP_Cinema;
import java.util.*;

import javax.swing.text.html.parser.Entity;
public class Cinema {
	
	
	public static void main (String[]args) {
		  Scanner scanner = new Scanner(System.in);
		  Customer cinema = new Customer();
		  
		System.out.println("*********************************************************************************");
		System.out.println("		Welcome to the Movie Ticketing System!");
		System.out.println("*********************************************************************************");

		boolean flag=true;
		while (flag) 
		{
		try 
		{
			
		System.out.print("Enter your name: ");
		String Name=scanner.nextLine();
		cinema.setName(Name);
		
		if(Name.matches("[a-zA-Z\s]{2,}"))
		{
			flag=false;
		}
	
		else 
		{
			throw new IllegalArgumentException("Name must contain at least 2 letters and do not include special characters.");
		}
		}
		
		catch(IllegalArgumentException e)
		{
            System.err.println(e.getMessage());
            flag=true;
		}
		 
	}	
		while(!flag)
		{
		String[] availableMovies = {"Interstellar", "Fight Club", "Oppenheimer"};
		
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < availableMovies.length; i++) 
        {
            System.out.println((i + 1) + ".) " + availableMovies[i]);
        }
      
        System.out.print("\nSelect the number (1-3) of the movie you want to watch: ");
        int movieIndex = scanner.nextInt();
        scanner.nextLine(); 
        
        if (movieIndex < 1 || movieIndex > availableMovies.length) {
            System.err.println("Invalid movie selection! Please try again.");
            continue;
        }
       
        
        if(movieIndex==1) 
        {
    
        	Movie.Movie1Display();
        	Time.TimeSlot();
        	
        	break;
        }
        if(movieIndex==2) 
        {
    
        	Movie.Movie2Display();
        	Time.TimeSlot();
    	
        	break;
        }
        if(movieIndex==3) 
        {
    
        	Movie.Movie3Display();
        	Time.TimeSlot();
     	break;
        }
        
	}
		
		
		
		 scanner.close();
          
		
	}
	
}
