package rough_practice;

public class RepetativeNumbersinPhonenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Phonenumber = "8500549902";

		char c = '5';
		System.out.println(count(Phonenumber, c));
		 
	}
	public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            	/*this will count the occurrence of
	          given character in the string
	          from index 1 to the last
	          index of the string */
            res++;
        }
        return res;
    }
}