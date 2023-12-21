package com.JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Shruthi");
		hm.put(2, "ruthika");
		hm.put(3, "harshini");
		hm.put(4, "Sahithi");
		hm.put(5, "Sharada");
		hm.put(6, null);
		hm.put(6, "Anil");
		hm.put(7, null);

		hm.put(null, null);
		hm.put(null, "test");

		System.out.println(hm);

		Set set = hm.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp);
		}

	}

}
