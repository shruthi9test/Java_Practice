package com.dec11;

public class Forloopex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i = 0; i<=10; i++) {
	if(i==5) 
		continue; // skip the number 5

	System.out.println(i);
}
for(int j=10; j>=0; j--) {
	if(j==5 || j == 7) 
		continue;
	
	System.out.println(j);
}
	}

}
