package com.Dec13;

public class MethodParamCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParamCalculation obj = new MethodParamCalculation();
		obj.add(10, 20);
		obj.sub(100, 10);
	}

	void add(int i, int j) {
		int k = i + j;
		System.out.println("addition of i and j: " + k);
	}

	void sub(int k, int i) {
		int l = k - i;
		System.out.println("Substraction of k and i: " + l);
	}
}
