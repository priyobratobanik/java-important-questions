package com.masai.ev2.q1;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String studentName;
	int marks;
	public Student() {
		super();
	}
	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
}
class main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of syudents");
		
		Student[] s=new Student[sc.nextInt()];
		
		for(int i=0;i<s.length;i++) {
			System.out.println("enter roll,name,marks respectively");
			s[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt());
			
		}
		for(int j=0;j<s.length;j++) {
			System.out.println("students "+(j+1));
			System.out.println("student name "+s[j].studentName);
			System.out.println("student roll "+s[j].rollNumber);
			System.out.println("student marks"+s[j].marks);
		}
	}
}




