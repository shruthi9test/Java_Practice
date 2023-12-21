package JavaLogicalPrograms;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		if (isprime(12)) {
//			System.out.println( " 12 is a prime number");
//		} else {
//			System.out.println( " 12 is not a prime number");
//		}
//		if (isprime(11)) {
//			System.out.println( " 13 is a prime number");
//		} else {
//			System.out.println( "13 is not a prime number");
//		}
//
//
//	}
//
//	public static boolean isprime(int n) {
//		if (n <= 1)
//			return false;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0)
//				return false;
//		}
//
//		return true;
//	}
//	
		int num = 89;
	      System.out.println("The given number is: " + num);
	      // initial count of factors
	      int count = 0;
	      // to check prime number
	      if(num == 2) {
	         System.out.println(num + " is a prime number");
	      } else {
	         // checking number of factors
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               count++;
	            }
	         }
	         // checking number of counts to print result
	         if(count == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	      }
	}
}
