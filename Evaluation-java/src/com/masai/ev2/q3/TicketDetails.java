package com.masai.ev2.q3;

import java.util.Scanner;

public class TicketDetails{

	    public static void main(String[] args) {
	  	
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter No Of Bookings of tickets");
		int bookings = s.nextInt();
		
		System.out.println("Available Tickets are");
		int availableTickets = s.nextInt();
		
		Tickets t2 = new Tickets(availableTickets);
		
		for(int a=1;a<=bookings;a++) {
		   System.out.println("enter TicketId");
		   int id = s.nextInt();
		   
		   System.out.println("enter price");
		   int price = s.nextInt();
		   
		   System.out.println("enter No Of Tickets");
		   int noOfTickets=s.nextInt();
		   
		   Tickets to = new Tickets(id,price,noOfTickets);
		   to.TotalPrice(noOfTickets);
           to.setAvailableTickets();
		   to.showDetails();
		   
		}
		
	}

}
