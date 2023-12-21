package com.JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("book");
		hs.add("pencil");
		hs.add("Eraser");
		hs.add("pen");
		hs.add("BlackBoard");
		hs.add("null");
		hs.add("Eraser");//duplicates not allowed

		System.out.println(hs);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {

			String name = itr.next();
			System.out.println(name);

			if (name.equals("pen"))
				System.out.println("Pen is exist");
		}

	}

}
