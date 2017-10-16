package com.shixun.set;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

		ArrayList<String> arrList1 = new ArrayList<String>();

		arrList1.add("黄忠原");
		arrList1.add("袁宇");
		arrList1.add("黄秋狼");
		arrList1.add("周朝璇");
		arrList1.add("任桥杰");
		arrList1.add("窦燕军");
		arrList1.add("卢腾宇");

		ArrayList<String> arrList2 = new ArrayList<String>();

		arrList2.add("文友");
		arrList2.add("孔立");
		arrList2.add("马泰");
		arrList2.add("苏晨光");
		arrList2.add("李泽毅");
		arrList2.add("谢梅");

		ArrayList<String> arrList3 = new ArrayList<String>();

		arrList3.add("潘帅");
		arrList3.add("简攀");
		arrList3.add("候春阳");
		arrList3.add("吴浩");
		arrList3.add("余坤");
		arrList3.add("李飞");

		arrayList.add(arrList1);
		arrayList.add(arrList2);
		arrayList.add(arrList3);

		Iterator<ArrayList<String>> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			ArrayList<String> string = iterator.next();
			System.out.println(string);
		}

		// for (ArrayList<String> string : arrayList) {
		// System.out.println();
		// for (String string2 : string) {
		// System.out.println(string2);
		// }
		// }

		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println();
			System.out.println("第" + (i + 1) + "组成员信息！");
			ArrayList<String> str = arrayList.get(i);

			for (String string2 : str) {
				System.out.println(string2);
			}
		}
	}
}
