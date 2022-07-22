package com.masai.ev5.q1;



public abstract class Employee {

	private int employeeId;
	private String employeeName;
	protected double salary;
	
	public Employee() {
		
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	abstract void calculateSalary();
	
}
	class PermanentEmployee extends Employee{
		
		

		private double basicPay;
		
		public PermanentEmployee() {
			
		}

		public double getBasicPay() {
			return basicPay;
		}

		public void setBasicPay(double basicPay) {
			this.basicPay = basicPay;
		}
		
		public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
			super(employeeId, employeeName);
			this.basicPay=basicPay;
			
		}

		@Override
		void calculateSalary() {
			double PFamount=basicPay*0.12;
			 salary=basicPay-PFamount;
			setSalary(salary);
		}
		
		
	}
	class TemporaryEmployee extends Employee{
		
		
		private int hoursWorked;
		private int hourlyWages;
		
		
		public int getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		public int getHourlyWages() {
			return hourlyWages;
		}
		public void setHourlyWages(int hourlyWages) {
			this.hourlyWages = hourlyWages;
		}

		public TemporaryEmployee() {
			
		}

		public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
			super(employeeId, employeeName);
			this.hoursWorked=hoursWorked;
			this.hourlyWages=hourlyWages;
		}



		@Override
		void calculateSalary() {
			
			 salary=hourlyWages*hoursWorked;
			setSalary(salary);
			
			
		}
		
		
		
	}
	class Loan{
		
		
		private Loan(){
			super();
		}
		
		static Loan getLoanObj() {
			return new Loan();
		}
		
		
		
		public double calculateLoanAmount(Employee employeeObj) {
			
			employeeObj.calculateSalary();
			
			if(employeeObj instanceof PermanentEmployee) {
				double loanAmount=employeeObj.salary*0.15;
				return loanAmount;
			}
			else if(employeeObj instanceof TemporaryEmployee) {
				double loanAmount=employeeObj.salary*0.10;
				return loanAmount;
			}
			else {
				return 0;
			}
			
			
		}
	}
	
	class Main{
		public static void main(String[] args) {
			
			
			Loan ll=Loan.getLoanObj();
			
			double permanentEmployeeLoan=ll.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
			double temporaryEmployeeLoan=ll.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
			System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
			System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
			
			
		}
	}
	
	
	
	
	