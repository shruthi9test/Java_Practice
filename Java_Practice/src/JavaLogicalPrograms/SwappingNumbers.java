package JavaLogicalPrograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		int n = 20;
		int i = 10;
		int j = 20;
		SwappingNosUsingThirdVariable(m, n);
		SwappingNosUsingAddition(i, j);
	}

	static void SwappingNosUsingThirdVariable(int m, int n) {
		/*
		 * int temp = m; // the value of m is stored in temp variable temp = 10 m = n; m
		 * = n; // the value of n is stored in m so m= 20
		 * 
		 * n = temp; // 10 is stored in n
		 * 
		 */

		m = m ^ n; // using XOR operation
		n = m ^ n; 
		m = m ^ n;
		// using XOR operation ^ we do swap the numbers 00 0, 01 1, 10 1, 11 0 // Logic
		// of XOR operator

		System.out.println("value of m is: " + m + " Value of n is: " + n);

	}

	// Java Program to swap the two values
	// without using third variable
	static void SwappingNosUsingAddition(int i, int j) {

		j = j - i; // 20-10 n = 10
		i = i + j; // m = 10+10 = 20;

		System.out.println("value of i is: " + i + " Value of j is: " + j);

	}
	
}
