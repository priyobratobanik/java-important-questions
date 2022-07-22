package com.masai.ev4.q1;

import java.util.Scanner;

public class Bank {
	
	String branchName;
	String ifscCode;
	
	
	
    public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	void displayDetails() {
    	System.out.println("Branch name is --->"+branchName);
    	System.out.println("IFSC code is----> "+ifscCode);
    }
}
class AxisBank extends Bank{
	
	double rateOfInterest;
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("rate of interest of Axix bank is "+rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the credit Card from the Axix Bank");
	}
	
}
class ICICIBank extends Bank{
	 double rateOfInterest;

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("rate of interest of ICICI bank is "+rateOfInterest);
	}
	 
}


class Demo{
	
	public static Bank getBank(String Bank) {
		
		if(Bank.equals("axis")) {
			AxisBank b1=new AxisBank();
			b1.setBranchName("Axis Bank-apd");
			b1.setIfscCode("AXIS100");
			b1.setRateOfInterest(8.75);
			
			return b1;
		}
		else if(Bank.equals("icici")) {
			ICICIBank b2=new ICICIBank();
			b2.setBranchName("ICICI bank-apd");
			b2.setIfscCode("ICICI1200");
			b2.setRateOfInterest(9.5);
			
			return b2;
		}
		else {
			return null;
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner ss=new Scanner(System.in);
		Demo d=new Demo();
		
		System.out.println("please enter your bank name");
		
		Bank b=Demo.getBank(ss.next());
		
		
		if(b instanceof AxisBank) {
			b.displayDetails();
			((AxisBank) b).getCreditCard();
		}
		else if(b instanceof ICICIBank) {
			b.displayDetails();
		}
		else {
			System.out.println("plese enter valid input");
		}
	}
	
	
}
