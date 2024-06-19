package TP_Cinema;

public class Customer {
	
	private String Name;
	public void setName (String SetName)
	{
		this.Name=SetName;
	}
	public String getName()
	{
		return this.Name;
	}
	
	public class TotalCost extends Customer
	{
		private static double totalCost;
		
		public void setTotalCost(int numOfTickets, double price) 
	    {
	        this.totalCost = numOfTickets * price;
	    }
		public double getTotalCost() 
	    {
	        return this.totalCost;
	    }
	}
	
}