package java15programs;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TAT";
		String strSave = "";
		int strlen = str.length();

		for (int i = strlen - 1; i >= 0; i--) {

			strSave = strSave + "" + str.charAt(i); // l,la, lat, lati, latig, latigi, latigid

			System.out.print(str.charAt(i));
		}

		System.out.println("");

		/*if (strSave.contentEquals(str)) {
			System.out.println("palindrom==yes");
		} else {
			System.out.println("not a palindrom");
		}*/

	}

}
