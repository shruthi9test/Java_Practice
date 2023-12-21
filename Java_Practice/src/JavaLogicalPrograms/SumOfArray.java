package JavaLogicalPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50 };

		int arraysum = 0;

		for (int i = 0; i < a.length; i++)
			arraysum += a[i]; // arraysum = arraysum+a[i];

		System.out.println("Sum of array: " + arraysum);

	}

}
