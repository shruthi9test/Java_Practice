package JavaLogicalPrograms;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ph = "8639932597";
		
		int totalcount = ph.length();
		
		int totalcount_afterremove = ph.replace("9", "").length();
		
		int number3remove = ph.replace("3", "").length();
		
		int count = totalcount - totalcount_afterremove;
		
		int count2 = totalcount - number3remove;
		
		System.out.println("Number of occurances of 9 is: " + count);
		
		System.out.println("Number of occurances of 3 is: " + count2);
	}

}
