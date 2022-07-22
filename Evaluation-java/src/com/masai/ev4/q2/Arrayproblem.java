package com.masai.ev4.q2;

import java.util.Scanner;

public class Arrayproblem {

	public static void main(String[] args) {
		
		try {
			Scanner ss=new Scanner(System.in);
			
			System.out.println("Enter the size of an Array");
			int[] arr=new int[ss.nextInt()];
			
			System.out.println("enter the elemnets of the Array");
			for(int i=0;i<arr.length;i++) {
				
				arr[i]=ss.nextInt();
			}
			
			System.out.println("enter the index of array you want to access");
			int index=ss.nextInt();
			
			System.out.println("the array element at index  ---->"+" "+index+"is "+arr[index]);
			
			
			System.out.println("the array element is successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
			System.out.println("Array index out of index");
			aie.printStackTrace();
		}
		catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("Number format exception is occured");
			nfe.printStackTrace();
			
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
