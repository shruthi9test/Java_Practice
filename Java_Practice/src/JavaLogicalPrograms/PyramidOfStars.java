package JavaLogicalPrograms;

public class PyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) { // 5 rows star

			for (int j = 1; j <= n-i; j++) { // for space
				System.out.print(" "); // printing spaces
			}

			for (int j = 0; j <= i; j++) { // innerloop handle columns,values changing according to outerloop
				System.out.print("* "); // printing stars }
			}

			System.out.println(); // ending line after each row
		}

	}

}
