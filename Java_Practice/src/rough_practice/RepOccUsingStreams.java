package rough_practice;

import java.util.stream.*;

public class RepOccUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "8500549902";
		char c = '0';
		char i = '5';
		System.out.println("no of occurances of 5 is: " + count(str, i));
	}

	public static long count(String s, char ch) {
		return s.chars().filter(i -> i == ch).count();
	}
}
