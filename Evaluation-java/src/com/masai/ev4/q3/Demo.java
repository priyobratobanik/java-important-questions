package com.masai.ev4.q3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		
		switch (m) {
		case JANUARY  :
			System.out.println("this is the 1st month of the year");
			break;
		case FEBRUARY  :
			System.out.println("this is the 2nd month of the year");
			break;
		case MARCH  :
			System.out.println("this is the 3rd month of the year");
			break;
		case APRIL  :
			System.out.println("this is the 4th month of the year");
			break;
		case MAY :
			System.out.println("this is the 5th month of the year");
			break;
		case JUNE :
			System.out.println("this is the 6th month of the year");
			break;
		
		case JULY  :
			System.out.println("this is the 7th month of the year");
			break;
		case AUGUST  :
			System.out.println("this is the 8th month of the year");
			break;
		case SEPTEMBER  :
			System.out.println("this is the 9th month of the year");
			break;
		case OCTOBER:
			System.out.println("this is the 10th  month of the year");
			break;
		case NOVEMBER:
			System.out.println("this is the 11th month of the year");
			break;
		case DECEMBER:
			System.out.println("this is the 12th month of the year");
		
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		try {
			Scanner ss=new Scanner(System.in);
			System.out.println("enter the month ");
			String monthname=ss.next();
			
			
			Month month=Month.valueOf(monthname.toUpperCase());
			
			Demo dd=new Demo();
			dd.showDetails(month);
		}
		catch (IllegalArgumentException ile) {
			System.out.println(ile.getMessage());
			System.out.println("invalid month name");
			ile.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		
	}

}
