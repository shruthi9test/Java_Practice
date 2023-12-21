package JavaLogicalPrograms;

public class ReverseStrSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NOTEPAD";
		char[] Cstr = str.toCharArray();
		int left;
		int right = str.length() - 1;
		for (left = 0; left < right; left++, right--) {
			char temp = Cstr[left];
			Cstr[left] = Cstr[right];
			Cstr[right] = temp;
			System.out.println(temp);
		}
		for (char c : Cstr)
			System.out.print(c);

	}

}
