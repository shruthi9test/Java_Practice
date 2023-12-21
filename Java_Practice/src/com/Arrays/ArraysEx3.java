package com.Arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Address = { "Shruthi", "Plot.No: 364", "H.No:14-81/71/4 ", "Raghavendra Colony", "Beearamguda" };
		System.out.println(Address[0]);
		System.out.println(Address[2]);
		System.out.println("=========================");
		for (int i = 0; i < 5; i++) {
			System.out.println(Address[i]);
		}
		int lengthOfArray = Address.length;
		System.out.println(lengthOfArray);
		System.out.println("=========================");
		for (int i = 0; i < lengthOfArray; i++) {
			System.out.println(Address[i]);
		}
		System.out.println("=========================");
		for (int i = 0; i < Address.length; i++) {
			System.out.println(Address[i]);
		}
		System.out.println("=========================");
		System.out.println(Arrays.toString(Address));

	}

}
