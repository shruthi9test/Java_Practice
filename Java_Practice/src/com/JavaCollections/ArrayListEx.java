package com.JavaCollections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> name = new ArrayList<String>();
name.add("Mango");
name.add("Grapes");
name.add("Pineapple");
name.add("Apple");
name.add("CustardApple");
name.add("Peach");
name.add("Guava");
name.add("Guava"); //Duplicated

System.out.println(name);
System.out.println(name.remove(3));

for(int i=0; i<name.size(); i++) {
	System.out.println(name.get(i));
}

	}

	
}
