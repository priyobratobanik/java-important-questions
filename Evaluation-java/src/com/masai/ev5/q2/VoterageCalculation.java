package com.masai.ev5.q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class invalidDateException extends Exception{

	public invalidDateException() {
		super();
		
	}

	public invalidDateException(String message) {
		super(message);
		
	}
	
	
}


public class VoterageCalculation {

	int checkAge() throws invalidDateException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth");
		String input=sc.next();
		
		LocalDate dobDate=LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate nowDate=LocalDate.now();
		
		Period pd=Period.between(dobDate, nowDate);
		
		if(pd.getYears()<0 && pd.getMonths()<0 && pd.getDays()<0) {
			System.out.println("Date should not be in future");
		}
		else if (pd.getYears()>18 && pd.getMonths()==0 && pd.getDays()==0) {
			
			System.out.println("Happy Birthday, You are eligible to cast your vote");
			
		}
		else if (pd.getYears()>18) {
			System.out.println("You are eligible to cast your vote");
		}
		else if(pd.getYears()<18) {
			System.out.println("sorry you are not elligible to cast your vote");
		}
		else {
			invalidDateException ide=new invalidDateException("Please pass the value in proper format");
			throw ide;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		
		try {
			VoterageCalculation vc=new VoterageCalculation();
			int result=vc.checkAge();
			
		}catch (invalidDateException ide) {
			System.out.println(ide.getMessage());
			
			
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
}
