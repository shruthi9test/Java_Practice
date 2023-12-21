package com.Dec13;

public class MethodwithDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 100;
		int discount = 5;

		MethodwithDatatype obj = new MethodwithDatatype();

		int disprice = obj.discount(price, discount);

		int AfterdiscountPrice = price - disprice;

		System.out.println("AfterdiscountPrice is: " + AfterdiscountPrice);
	}

	int discount(int price, int discount) {
		int res = price * discount / 100;
		System.out.println("discounted price is: " + res);
		return res;

	}
	
}
