package com.Dec29Encapsulation;

public class Bike {
 String color = "Black";
 String name = "Dhoom";
 String break_type = "Disk";
 String gear = "5";
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bike obj = new Bike();
 obj.make_bike();
 
	}
void make_bike() {
	System.out.println("Name of the bike is: " +name);
	System.out.println("Color of the bike is: " +color);
	System.out.println("No of gears: " +gear);
	System.out.println("Break type" +break_type);
}
}
