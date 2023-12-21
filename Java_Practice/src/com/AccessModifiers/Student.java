package com.AccessModifiers;

public class Student {
	public String name = "Shruthi";
	public String Class = "x";
	public String address = "Beeramguda";
	protected String rank = "1st rank";

	protected void disprank() {
		System.out.println(rank);
	}

  public void display() { // default keyword used for interfaces
		System.out.println("Hello i am a student");
	}

	protected  void marks() {
		System.out.println("total marks are 500");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.Class);
		System.out.println(obj.address);
		obj.disprank();
		obj.display();
		obj.marks();
	}
 
}
