package com.Dec07;

public class ConditionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 35;
		if (i == 34) // for one line condition and statement no need of {}
			System.out.println("result is pass");

		else
			System.out.println("result is fail");

		String name = "Shruthi";
		if (name.equals("Shruthi")) {
			System.out.println("name is called as shruthi");
		}
		/*
		 * marks 35 to 49 3rd class marks 50 to 60 2nd class marks 60 and above 1st
		 * class
		 */
		int marks = 75;
		if(marks >=35 && marks <=100) {
		if (marks >= 35 && marks <= 49) {
			System.out.println("3rd class");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("2nd class");
		} else if (marks >= 60 && marks <= 100) {
			System.out.println("1st class");
		} else {
			System.out.println("Failed");
		}
		}
		
	}

}
