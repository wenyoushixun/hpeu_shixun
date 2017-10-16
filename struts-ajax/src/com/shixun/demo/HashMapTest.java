package com.shixun.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

//		Map<Integer, String> hashMap = new HashMap<Integer, String>();
//		hashMap.put(1, "姓名：实训");
//		hashMap.put(2, "年龄：25");
//		hashMap.put(3, "爱好：读书、音乐、游戏");
//		
//		// 获取迭代器对象
//		Iterator<Entry<Integer, String>> iter = hashMap.entrySet().iterator();
//
//		while (iter.hasNext()) {
//			@SuppressWarnings("rawtypes")
//			Map.Entry entry = (Entry) iter.next();
//			
//			// 返回与此项对应的键
//			Object key = entry.getKey(); 
//			
//			// 返回与此项对应的值
//			Object val = entry.getValue();
//			
//			System.out.println("Key: " + key + ", Value: " + val);
//		}
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "姓名：实训");
		hashMap.put(2, "年龄：25");
		hashMap.put(3, "爱好：读书、音乐、游戏");
		
//		System.out.println(hashMap);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			Integer key= iterator.next();
			String value = hashMap.get(key);
			System.out.println("key:"+key+","+"value:"+value);	
		}
	}
}
