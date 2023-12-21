package com.Dec13;

public class MethodParameterExString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameterExString obj = new MethodParameterExString();
		obj.name("Vyahruthi");
		obj.address("shruthi", "14/81/71/40");
		obj.studentaddress();
	}

	void name(String name) {
		System.out.println("name is:  " + name);
	}
	int rollno(int rl) {
		System.out.println("roll no is" +rl);
		return rl;
	}

	void address(String name,String HouseNo) {
		System.out.println("full name is:  " + name);
		System.out.println("full address is:  "   + studentaddress());
		System.out.println(rollno(10));
		System.out.println("full address is:  " + HouseNo);
	}
	String studentaddress() {
		return "RaghavedraColony";
	}
}
