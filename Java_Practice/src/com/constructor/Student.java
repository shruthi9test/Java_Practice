package com.constructor;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj = new Student();
Student obj2 = new Student("shruthi");
Student obj3 = new Student(10);
Student obj4 = new Student("Vyahruthi", 9);
Student obj5 = new Student(11, "Anil");
obj.marks();
	}
Student(){
System.out.println("I am a student of DigtalCutlet");
}
Student(String name){
	System.out.println("Student name is: " +name);
}
Student(int rollno){
	System.out.println("Student name is: " +rollno);
}
Student(String name, int rollno){
	System.out.println("Student name is: " +name + " roll Number is  "   +  rollno);
}
Student(int rollno, String name){
	System.out.println("Student name is: " +name + " roll Number is  "   +  rollno);
}
void marks() {
	System.out.println("100");
}
}
