package com.Dec27Final;

public   class College {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 final String name = "Shruthi";
 System.out.println("student name is  " +name);
	
	}
	final void dept(String department) { // Overload will work
		 System.out.println("HR");
	 }
	/* duplicate method not allowed final void dept(String department) { // Overload will work
		 System.out.println();
	 }*/
	final void dept(int departmentNo) {
		 System.out.println(1011);
	 }
}
