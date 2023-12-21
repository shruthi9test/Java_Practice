package com.dec12;

public class MethodParameterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameterEx obj = new MethodParameterEx();
		obj.name("Vyahruthi");
		obj.address("shruthi", "Raghavendracolony", "14/81/71/40");
	}

	void name(String name) {
		System.out.println("name is:  " + name);
	}

	void address(String name, String address, String HouseNo) {
		System.out.println("full address is:  " + name);
		System.out.println("full address is:  " + address);
		System.out.println("full address is:  " + HouseNo);
	}
}
