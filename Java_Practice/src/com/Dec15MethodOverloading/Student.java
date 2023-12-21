package com.Dec15MethodOverloading;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj = new Student();
obj.studentinfo();
obj.studentinfo("Archana");
obj.studentinfo(10);
double marks = obj.studentinfo(80.5);

System.out.println("Student totalmarks is: " +marks );
	}
 void studentinfo(){
System.out.println("I am a student of DigtalCutlet");
}
 void studentinfo(String name){
	System.out.println("Student name is: " +name);
}
 void studentinfo(int rollno){
	System.out.println("Student name is: " +rollno);
}
 double studentinfo(double totalmarks){
	 double coronabonus = totalmarks+10;
	 return coronabonus;
	
}
}
