package com.Dec15MethodOverloading;

public class Polymorphism_Parentclass {
	String name = "ShivaNilayam";
	String HouseType = "2bhk";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Parentclass obj = new Polymorphism_Parentclass();
		obj.house();
		obj.bike("HeroHonda");
		obj.car();
		
	}
 void car() {
	 System.out.println("Shiva holding Maruthi 800");
 }
  void bike(String name) {
		System.out.println(name + " bike");
	}
 void house() {
		System.out.println("I am holding a flat with " + HouseType + " name of the house is " + name);
	}
 Polymorphism_Parentclass(){
		System.out.println("My name is Shiva");
	}
	
}
