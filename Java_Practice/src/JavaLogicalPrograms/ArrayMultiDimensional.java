package JavaLogicalPrograms;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4 2 3 40 20 30 22 23 56
		 */
		int a[][] = { { 4, 2, 3 }, { 40, 20, 30 }, { 22, 23, 56 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] == 3) {
					System.out.println("found at pos : " + i + " " + j);
				}
			}
		}
		// Low Number in Matrix is
		int low = a[0][0];
		int columNum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// System.out.print(a[i][j]);
				if (a[i][j] < low) {
					System.out.println("current low is : " + a[i][j]);
					low = a[i][j];
					columNum = j;
				}
			}
		}
		int max = a[0][columNum];
		for (int i = 0; i < 3; i++) {
			if (max < a[i][columNum]) { // 4 2 3 40 20 30 22 23 56
				max = a[i][columNum];
			}
		}
		System.out.println("max number is : " + max);
	}

}
