package com.masai.ev1.q3;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	
	
	public Lion(String name,boolean isHungry,int age) {
		super();
		this.name=name;
		this.isHungry=isHungry;
		this.age=age;
		
		
	}
	
	
	static void  printKillings() {
		System.out.println("total killings by lion in jungle"+totalDeaths);
	}
	void thinking() {
		if(isHungry==true) {
			System.out.println("is sleeping");
		}
		else if(isHungry==true && age>12) {
			totalDeaths=totalDeaths+2;
			System.out.println("lion has eaten two animals");
		}
		else if(isHungry==true && age<=12 && age>=2) {
			totalDeaths=totalDeaths+1;
			System.out.println("has eaten one animal");
		}
		else if(isHungry==true && age<=2) {
			System.out.println("is calling mom");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lion l1=new Lion("lion1", false, 20);
Lion l2=new Lion("lion2", true, 5);
Lion l3=new Lion("lion3",true,30);


l1.thinking();
l2.thinking();
l3.thinking();


l1.printKillings();

	}

}
