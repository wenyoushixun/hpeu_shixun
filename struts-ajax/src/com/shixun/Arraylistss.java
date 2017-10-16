package com.shixun;

import java.util.ArrayList;

public class Arraylistss {

	public static void main(String[] args) {

		String[] string = { "好学生", "蜘蛛侠", "好好学习", "好的", "同意", "出去玩" };

		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < string.length; i++) {
			String str = string[i];
			arrayList.add(str);
		}
		System.out.println(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			String str = string[i];
			if (str.startsWith("好")) {
				System.out.println(str);
			}
		}

	}
}
