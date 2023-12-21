package com.Dec29Encapsulation;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Car_Parts obj = new Car_Parts();
	 	obj.setName("creta");
	 	obj.setColor("Blue");
	 	obj.setGears("6");
	 	obj.setNoofcly("4");
	 	obj.setAir_bags("2");
	 	obj.setSeater("5");
	 	obj.setBreak_type("ABS");
	 	
	 	System.out.println(obj.getName());
	 	System.out.println(obj.getColor());
	 	System.out.println(obj.getGears());
	 	System.out.println(obj.getNoofcly());
	 	System.out.println(obj.getAir_bags());
	 	System.out.println(obj.getSeater());
	 	System.out.println(obj.getBreak_type());
	 	
	 	System.out.println("==============");
	 	
	 	obj.displayCar();
	 	System.out.println("==============");
	 	
	 	obj.createCar("Manza", "6", "Brown", "4", "ABS", "5", "6");
	 	obj.displayCar();
	 	/* getName());
		System.out.println("No of gears " + getGears());
		System.out.println("Color of the car " + getColor());
		System.out.println("No of cyl " +getNoofcly());
		System.out.println("Break type " +getBreak_type());
		System.out.println("No of seats " +getSeater());
		System.out.println("No of air bags " + getAir_bags());
		System.out.println("Car is ready to use");*/
	 	System.out.println("==============");
	 	obj.createCar("Nano", "4", "Ash", "2", "ABS", "4", "2");
	 	obj.displayCar();
	 	
	 	
	}

}
