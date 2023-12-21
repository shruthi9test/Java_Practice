package com.Dec29Encapsulation;

public class Car_Parts {

	private String name;
	private String gears;
	private String color;
	private String break_type;
	private String seater;
	private String air_bags;
	private String noofcly;

	public void setName(String val) {
		name = val;
	}

	public String getName() {
		return name;
	}
	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreak_type() {
		return break_type;
	}

	public void setBreak_type(String break_type) {
		this.break_type = break_type;
	}

	public String getSeater() {
		return seater;
	}

	public void setSeater(String seater) {
		this.seater = seater;
	}

	public String getAir_bags() {
		return air_bags;
	}

	public void setAir_bags(String air_bags) {
		if(air_bags.equals("2")) {
			this.air_bags = "6";
		}
		else {
			this.air_bags = air_bags;
			}
	}

	public String getNoofcly() {
		return noofcly;
	}

	public void setNoofcly(String noofcly) {
		this.noofcly = noofcly;
	}

	public void displayCar() {
		System.out.println("Name of the car " + getName());
		System.out.println("No of gears " + getGears());
		System.out.println("Color of the car " + getColor());
		System.out.println("No of cyl " +getNoofcly());
		System.out.println("Break type " +getBreak_type());
		System.out.println("No of seats " +getSeater());
		System.out.println("No of air bags " + getAir_bags());
		System.out.println("Car is ready to use");
	}
	// smartway of calling method by giving values here 
	public void createCar(String val1, String val2, String val3, String val4, String val5, String val6, String val7) {
		setName(val1);
		setGears(val2);
		setColor(val3);
		setNoofcly(val4);
		setBreak_type(val5);
		setSeater(val6);
		setAir_bags(val7);
	}
}
