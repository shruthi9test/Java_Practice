package com.Dec07;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 34;

		if (marks >= 35 && marks <= 49) {

			System.out.println("3rd Class");
		} else if (marks >= 50 && marks <= 60) {

			System.out.println("2nd Class");
		} else if (marks >= 60 && marks <= 100) {

			System.out.println("1st Class");

		} else if (marks > 100) {

			System.out.println("OverQualified");
		} else {

			System.out.println("Failed");
		}
	}

}
