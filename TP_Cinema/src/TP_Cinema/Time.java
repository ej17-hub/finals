package TP_Cinema;
import java.util.*;

public class Time {

	public static void TimeSlot()
	{
		Scanner scan=new Scanner (System.in);
		int input;
	while (true)
	{
	try 
	{
		String[] TimeSlot = {"12:00 P.M", "3:00 P.M", "6:00 P.M"};
        System.out.println("\nTime slots of the Movie");
        for (int i = 0; i < TimeSlot.length; i++) 
        {
            System.out.println((i + 1) + ".) " + TimeSlot[i]);
        }
        System.out.print("\nSelect:");
        input=scan.nextInt();
         
         if (input < 1 || input > TimeSlot.length) 
         {
        	 throw new Range();
         }
         if(input ==1)
         {
        	 Seat_Reserve.Seat();
        	 break;
         }
         if(input ==2)
         {
        	 Seat_Reserve.Seat();
        	 break;
         }
         if(input ==3)
         {
        	 Seat_Reserve.Seat();
        	 break;
         }
	}
		catch(InputMismatchException e) 
		{
			System.err.println("Invalid Input.");
			scan.nextLine();
			continue;
		}
	catch(Range ftw)
	{
		System.err.println(ftw.getMessage());
		continue;
	}
	}
	
}


}
