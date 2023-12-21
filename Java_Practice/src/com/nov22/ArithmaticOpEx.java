package com.nov22;

public class ArithmaticOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int k = a + b;
		System.out.println(k);
		int S = b - a;
		System.out.println(S);
		int M = k * S;
		System.out.println(M);
		int D = b / a;
		System.out.println(D);
		int Mod = 100 % 22;
		System.out.println("Modulus value is " + Mod);
		float marks = 530;
		float total_marks = 600;
		float percentage_Marks = (marks / total_marks) * 100;
		System.out.println(percentage_Marks);
	}

}
