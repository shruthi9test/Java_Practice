package JavaLogicalPrograms;

public class ArmStrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int temp;
		int n1 = n; // this is for if condition

		int sum = 0;
		while (n > 0) {
			temp = n % 10;
		//	System.out.println(temp);
			sum = sum + (temp * temp * temp);
			
			n = n / 10;
			

		}
		System.out.println(sum);

		if (n1 == sum) {

			System.out.println("its an armstrong Numeber");
		} else {
			System.out.println("its not an armstrong number");

		}
	}
}
