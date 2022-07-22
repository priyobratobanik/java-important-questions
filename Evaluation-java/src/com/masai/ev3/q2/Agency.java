package com.masai.ev3.q2;

import java.util.Scanner;

public class Agency {

	
	
	double calculateAverage(int[] age) {
		
		int sum=0;
		for(int x=0;x<age.length;x++) {
			sum=sum+age[x];
		}
		double average=sum/age.length;
		
		return average;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no of employees");
		int empno=sc.nextInt();
		int [] age=new int[empno];
		
		System.out.println("enter the age for "+empno+"employees");
		for(int i=1;i<=age.length;i++) {
			
			
			System.out.println("enter the Age for 2 employee"+i);
			age[i]=sc.nextInt();
			
		}
		Agency agency=new Agency();
		double result=agency.calculateAverage(age);
		System.out.println("Average age of Employee is "+result);
		
	}
}
