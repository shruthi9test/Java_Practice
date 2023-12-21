package com.Interface;

public class College implements library,Faculty{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
College obj = new College();
obj.books();
obj.academicbooks();
obj.dept();
obj.depts();
obj.records();

	}

	public void dept() {
		System.out.println("Department is HR");
		
	}

	@Override
	 public void books() {
		System.out.println("novels are available");
		
	}

	@Override
	public void records() {
				System.out.println("Student Entry and exit details are available");
	}

	@Override
	public void academicbooks() {
		System.out.println("Academic Textbooks available");
		
	}

	@Override
	public void MathsBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ScienceBook() {
		// TODO Auto-generated method stub
		
	}

	

}
