package JavaLogicalPrograms;

public class NumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}