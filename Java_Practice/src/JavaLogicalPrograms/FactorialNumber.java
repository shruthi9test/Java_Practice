package JavaLogicalPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		System.out.println("factorial of a number is: " + factorial);
	}

}
