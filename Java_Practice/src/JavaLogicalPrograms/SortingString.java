package JavaLogicalPrograms;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {

		String[] inputList = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);

		// Call to sort the input list.
		Arrays.sort(inputList);

		// Display the sorted list.
		System.out.println("\n-------Sorted List-------");
		showList(inputList);

		// Call to sort the input list in case-sensitive order.
		System.out.println("\n-------Sorted list (Case-Sensitive)-------");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		showList(inputList);
	}

	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
