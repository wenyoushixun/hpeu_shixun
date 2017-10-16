package com.shixun.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		
		hashMap.put("name", "wenyou");
		hashMap.put("age", "18");
		hashMap.put("phone", "110");
		hashMap.put("address", "遵义");
		
		System.out.println(hashMap);
		
		hashMap.remove("age");
		System.out.println(hashMap);
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			String key= iterator.next();
			String value = hashMap.get(key);
			System.out.println("key:"+key+","+"value:"+value);		
		}
	}
}

