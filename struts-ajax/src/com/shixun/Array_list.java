package com.shixun;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("李飞");
		arrayList.add("文友");
		arrayList.add("孔丽");
		arrayList.add("李超");
		arrayList.add("李白");
		arrayList.add("马泰");
		arrayList.add("李元霸");

		System.out.println(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			if (str.startsWith("李")) {
				System.out.println(str);
			}
		}
	}

}
