package com.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println("=========================");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("=========================");
		int lengthOfArray = a.length;
		System.out.println(lengthOfArray);
		System.out.println("=========================");
		for (int i = 0; i < lengthOfArray; i++) {
			System.out.println(a[i]);
		}
		System.out.println("=========================");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
