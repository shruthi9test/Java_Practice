package com.Dec27Abstract;

public abstract class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello ");
		Emp.Dept();
	}
  Emp(){
	  System.out.println("I am from Constructor");
  }
   abstract void salary();
   void bonus() {
	   System.out.println("Bonus is added");
   }
   static void Dept() {
	   System.out.println("Teaching");
   }
}
