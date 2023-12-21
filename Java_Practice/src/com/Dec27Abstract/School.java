package com.Dec27Abstract;

public class School extends Emp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
School obj = new School();
obj.salary();
obj.bonus();
Emp.Dept();

	}

	@Override
	void salary() {
		System.out.println("Salary is about 10000 rupees");
		
	}
	School(){
		System.out.println("School name is Adarsha");
	}

}
