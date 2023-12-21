package com.nov22;

public class UnaryOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// postfix increment
		int i = 20;
		i++;
		System.out.println(i); // 21
		System.out.println(i++);// 21
		System.out.println(i++);// 22
		System.out.println(i);// 23
		System.out.println("====================================");
		// postfix Decrement
		int j = 20;
		j--;
		System.out.println(j); // 19
		System.out.println(j--); // 19
		System.out.println(j); // 18
		System.out.println(j--); // 18
		System.out.println(j); // 17
		System.out.println("====================================");
		// prefix increment
		int k = 20;
		++k;
		System.out.println(++k); // 22
		System.out.println(k); // 22
		System.out.println(++k); // 23
		System.out.println(++k); // 24
		System.out.println(k); // 24
		System.out.println("====================================");
		// prefix decrement
		int L = 20;

		--L;
		System.out.println(L); // 19
		System.out.println(--L); // 18
		System.out.println(L); // 18
		System.out.println(--L); // 17
		System.out.println(L); // 17
		System.out.println("====================================");
	}

}
