package rough_practice;

public class RepetativeNumbersinPhonenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Phonenumber = "8500549902";

		char c = '0';
		System.out.println("The occurance of 0 in a string: " + countinString(c, Phonenumber));
		char i = '5';
		System.out.println("The occurance of 5 in a string: " + countinString(i, Phonenumber));

	}

	static int countinString(char ch, String s) {
		// base case;
		if (s.length() == 0)
			return 0;
		int count = 0;

		// checking if the first character of
		// the given string is that character
		// or not
		if (s.charAt(0) == ch)
			count++;

		// this will count the occurrence of
		// given character in the string
		// from index 1 to the last
		// index of the string
		count += countinString(ch, s.substring(1)); // count = count+

		return count;
	}
}
