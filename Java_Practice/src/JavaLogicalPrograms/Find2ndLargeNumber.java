package JavaLogicalPrograms;

public class Find2ndLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 23, 45, 56, 65, 54, 34, 66, 78, 91, 1, 3, 35 };
		Find2ndLargeNumber obj = new Find2ndLargeNumber();
		obj.largenumber(list);

	}

	void largenumber(int[] num) {
		int FirstLarge = 0;
		int SecondLarge = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > FirstLarge) {
				SecondLarge = FirstLarge; // num[i]> 91 condition false so,78 stored in secondlarge
				FirstLarge = num[i]; // firstlarge = 91,
			} else if (num[i] > SecondLarge) {
				SecondLarge = num[i]; // here 2ndlarge 78
			}
		}
		System.out.println("first : " + FirstLarge);
		System.out.println("second : " + SecondLarge);

		/*
		 * if (maxOne < n) { maxTwo = maxOne; maxOne = n; } else if (maxTwo < n) {
		 * maxTwo = n; }
		 */

	}
}
