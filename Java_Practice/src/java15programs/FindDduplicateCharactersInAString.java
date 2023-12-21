package java15programs;

import java.util.HashMap;
import java.util.Map;

public class FindDduplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "programming";

        System.out.println("Duplicate characters in the string '" + inputString + "':");
        printDuplicateCharacters(inputString);
    }

    // Function to find and print duplicate characters in a string
    static void printDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> map = new HashMap<>();

        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();

        // Iterate through each character in the array
        for (char c : charArray) {
            // Update the frequency in the map
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Print characters with frequency greater than 1 (duplicates)
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
	}

}
