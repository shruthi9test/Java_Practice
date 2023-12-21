package JavaLogicalPrograms;

public class FindALetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "shruthi kulkarni";
		a.length();
		System.out.println(a.contains("kulkarni")); // find a word from given string using in-build method

		System.out.println(a.indexOf("n")); // in-build method to find the index of a string

		for (int i = 0; i < a.length(); i++) {
			// System.out.println(a.charAt(i));
			if (a.charAt(i) == 'l') {
				System.out.println("found l at : " + i);
				break; // break the for loop
			}

		}

	}

}
