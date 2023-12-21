/*Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
Non-Primitive Data Type or Object Data type: such as String, Array, etc.*/
package com.nov22;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
		if (a = true) {
			System.out.println(" boolean function is true");
		} else {
			System.out.println("boolean function is false");
		}
		char nm = 's';
		char ss = 'm';
		System.out.println(nm);
		System.out.println(ss);
		short s = 56;
		System.out.println("short: " + s);
		int i = 89;
		System.out.println("integer: " + i);
		int k = 100;
		int B = 200;
		int z = k + B;
		System.out.println(z);
		double d = 4.355453532;
		System.out.println("double: " + d);
		long l = 12121;
		System.out.println("long: " + l);
		float f = 4.7333434f;
		System.out.println("float: " + f);
		byte Y =  (byte)1111;
		System.out.println(Y);
		

		String name = "Vyahruthi";
		String Dadname = "Anil";
		String Mothername = "Shruthi";
		System.out.println(name + " " + Dadname + " " + Mothername);
		int[] A = {10,11,12,12,14};
		for(int p = 0; p<A.length; p++) {
			System.out.println(A[p]);
		}
	}
}
