package JavaLogicalPrograms;

public class IndexNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 1, 2, 3, 4, 5, 10, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]); (while using this we cannot use break because
			// output showing 0)

			System.out.println("=========");
			System.out.println(a[6]);
			break;
			// to exit the loop use break statement.
		}
	}

}
