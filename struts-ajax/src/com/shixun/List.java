package com.shixun;

import java.util.ArrayList;

/**
 * 
 * @author wenyou
 *
 */
public class List {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		printlist(arrayList);

		arrayList.add("wenyou");
		printlist(arrayList);

		arrayList.add("kongli");
		printlist(arrayList);

		arrayList.add("lizeyi");
		printlist(arrayList);

		arrayList.add("matai");
		printlist(arrayList);

		arrayList.clear();
		printlist(arrayList);

	}

	public static void printlist(ArrayList<String> arrayList) {

		int size = arrayList.size();
		System.out.println("arrayList长度为: " + size);

		boolean isEmpty = arrayList.isEmpty();
		System.out.println("arrayList是否为空: " + isEmpty);

		boolean contains = arrayList.contains("wenyou");
		System.out.println("arrayList中是否存在wenyou: " + contains);

		int indexOf = arrayList.indexOf("wenyou");
		System.out.println("arrayLis中wenyou存在的位置: " + indexOf);

		for (int i = 0; i < arrayList.size(); i++) {
			String string = arrayList.get(i);
			System.out.println("遍历" + i + ":" + string);
		}

		System.out.println();

	}

}
