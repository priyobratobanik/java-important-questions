package com.masai.ev3.q1;

import java.util.Scanner;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;
	
	
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}


class Sedan extends Car{
	
	final int farePerKm=20;
	
}
class HatchBack extends Car{
	final int farePerKm=15;
	
}

class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hb=new HatchBack();
			hb.setNumberOfPassenger(numberOfPassenger);
			hb.setNumberOfKms(numberOfKMs);
			return hb;
		}
		else {
			Sedan sd=new Sedan();
			sd.setNumberOfPassenger(numberOfPassenger);
			sd.setNumberOfKms(numberOfKMs);
			return sd;
		}
		
		
	}
	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			HatchBack carBack=(HatchBack)car;
			int totalfare=car.getNumberOfKms()*carBack.farePerKm;
			return totalfare;
		}
		else {
			Sedan carsedan=(Sedan)car;
			int totalfare=car.getNumberOfKms()*carsedan.farePerKm;
			return totalfare;
		}
	}
}

	
	class Main{
		public static void main(String[] args) { 
			Scanner scanner = new Scanner(System.in); 
			
			OLA myOla = new OLA();
			System.out.println("enter number of passengers and number of kms==>");
			
			Car myCar = myOla.bookCar(scanner.nextInt(), scanner.nextInt());
			int res = myOla.calculateBill(myCar);
			System.out.println("The total fare amount is===>"+ res);
			} 
		
		}
		
	
		
	






