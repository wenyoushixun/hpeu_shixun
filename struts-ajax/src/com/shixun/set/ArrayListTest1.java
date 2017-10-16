package com.shixun.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ArrayListTest1 {

	public static void main(String[] args) {

		ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put("name", "文友");
		hashMap1.put("age", "18");
		hashMap1.put("address", "遵义");

		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("name", "孔立");
		hashMap2.put("age", "18");
		hashMap2.put("address", "毕节");

		HashMap<String, String> hashMap3 = new HashMap<String, String>();
		hashMap3.put("name", "谢梅");
		hashMap3.put("age", "18");
		hashMap3.put("address", "毕节");

		arrayList.add(hashMap1);
		arrayList.add(hashMap2);
		arrayList.add(hashMap3);

		for (int i = 0; i < arrayList.size(); i++) {
			HashMap<String, String> hashMap = arrayList.get(i);
			System.out.println(hashMap);

			Set<String> keySet = hashMap.keySet();
			Iterator<String> iterator = keySet.iterator();

			while (iterator.hasNext()) {
				String key = iterator.next();
				String value = hashMap.get(key);
				System.out.println("key:" + key + "," + "value:" + value);
			}
			System.out.println();
		}
	}
}
