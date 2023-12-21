package com.Dec15MethodOverloading;

public class ThisKeyword {
	String schoolname = "Adharsha";

	void PrintSchoolName() {
		System.out.println("School name is:  " + schoolname);
	}

	void display(String Studentname, int rollNumber, String schoolname) {
		System.out.println("Name of the student  " + Studentname);
		System.out.println("Student roll number is  " + rollNumber);
		System.out.println("School name is:  " + schoolname);
		System.out.println("Using this keyword School name is:  " +this.schoolname);
		System.out.println("========================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		obj.display("Bharath", 1, "CBV");
		obj.display("Arshad", 2, "CBV");
		obj.display("Lucky", 3, "CBV");
		obj.PrintSchoolName();

		System.out.println("=============================");
	}

	ThisKeyword() {
		System.out.println("I am from Constructor");
	}
}
