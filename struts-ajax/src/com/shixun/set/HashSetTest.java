package com.shixun.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		
//		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add("李四");
//		hashSet.add("张三");
//		hashSet.add("啊文");
//		hashSet.add("王五");
//		
//		System.out.println(hashSet);
//		
//		Iterator<String> iterator = hashSet.iterator();
//		
//		while(iterator.hasNext()){
//			String str = iterator.next();
//			System.out.println(str);
//		}
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 1; i <= 100; i++) {
			hashSet.add(i);
		}
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			Integer integer = iterator.next();
			System.out.print(integer+", ");
		}
		
		System.out.println();
		System.out.println(hashSet);
	}
}
