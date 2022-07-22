package com.masai.ev2.q3;

public class Tickets {
	private int ticketID;
	private int price; 
	private static int availableTickets;
	private int noOfTickets;
	private int left; 
	private int amount;
	
	Tickets(int availableTicket){
		availableTickets = availableTicket;

	}
	
	
	    Tickets(int ticketId,int price,int noOfTickets){
		this.ticketID = ticketId;
		this.price  = price;
		this.noOfTickets=noOfTickets;

	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets=noOfTickets;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	
	
	public void setTicketId(int ticketId)
	{
		this.ticketID=ticketId;
	}
	public void TotalPrice(int noOfTickets) {

		int amount =  this.price*this.noOfTickets;
		this.amount=amount;

	}
	
	public void setAvailableTickets() {
		if(availableTickets<0)
		{
			System.out.println(-1);
		}
		else {
			int leftTickets = availableTickets - this.noOfTickets;
		this.left = leftTickets;
			availableTickets=leftTickets;
		}
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	public void showDetails() {
		System.out.println("No of Available Tickets :"+availableTickets);
		System.out.println("Amount is :"+amount);
		System.out.println("Available tickets after Booking is :"+left);
	}

}