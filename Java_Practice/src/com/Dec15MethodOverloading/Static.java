package com.Dec15MethodOverloading;

public class Static {

	static String name = "Sunil";
	static String cls = "XI";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static obj = new Static();
		Static.Studentname("Shruthi");
		obj.Studentclass();
		Static.StudentAddress();
	}

	void Studentclass() {
		System.out.println("student class is  " + Static.cls);
		

	}

	static String Studentname(String name) {
		System.out.println("student name is  " + name);
		return "Shruthi";

	}

	static void StudentAddress() {
		System.out.println("student address is  Nizamabad");
	}

	static {
		System.out.println("I am from from a static block");
	}

}
