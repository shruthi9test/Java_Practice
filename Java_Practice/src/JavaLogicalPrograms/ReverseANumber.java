package JavaLogicalPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any number");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (n > 0) {

			int r = n % 10; // remainders 3 2 5 1
			// System.out.print("Reverse order : " + r);
			System.out.print(+r);
			n = n / 10; // 152/10; 15/10; 1/10

		}

	}

}
