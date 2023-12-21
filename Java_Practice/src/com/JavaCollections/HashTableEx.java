package com.JavaCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "Hyd");
		ht.put(11, "Vizag");
		ht.put(12, "Bgr");
		ht.put(13, "Dmp");
		ht.put(14, "Knr");
		ht.put(15, "Bgd");

// not allowed ht.put(null, null);
//ht.put(null, "Begumpet");

		System.out.println(ht);

	Set set = ht.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp);
		}
	}

}
