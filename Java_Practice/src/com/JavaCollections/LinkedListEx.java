package com.JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("book");
		obj.add("pencil");
		obj.add("Eraser");
		obj.add("pen");
		obj.add("BlackBoard");
		System.out.println(obj);

		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		Iterator<String> itr = obj.iterator();
		while (itr.hasNext()) {
			
			String name = itr.next();
			System.out.println(name);
			
			if (name.equals("pen"))
				System.out.println("Pen is exist");
		}

	}

}
