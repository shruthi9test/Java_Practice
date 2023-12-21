package java15programs;
import java.io.*;
import java.util.Scanner;

public class ReverseStrFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
char[] arr = str.toCharArray(); //convert string to character array using tocharArray()
 String Rev = "";
 for(int i = str.length()-1; i>=0;i--) {
	 //no need line no.15 code
	 //System.out.print(arr[i]);
	 Rev = Rev+str.charAt(i);
 }
 System.out.println(Rev);
	}

}
