package com.Arrays;

import java.util.Arrays;

public class Arrays_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(a[3]); // to print single value
		System.out.println(a[0]);

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("===================");
		String lengthofarray = Arrays.toString(a);// conversion to string
		System.out.println(lengthofarray);
		System.out.println("===================");
		int lengthOfArray = a.length;
		System.out.println(lengthOfArray);
		for (int i = 0; i < lengthOfArray; i++) {
			System.out.println(lengthOfArray);
		}
		System.out.println("===================");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
