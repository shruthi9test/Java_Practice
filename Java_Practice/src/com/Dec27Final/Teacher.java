package com.Dec27Final;

public class Teacher  extends College{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher obj = new Teacher();
obj.dept("HR");
obj.dept(1011);

	}
// can not override the final method 
	//final void dept(String department) {}
	/* final void dept(String department) { // Overload will work
		 System.out.println("HR");
	 }*/
}

