package com.shixun.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		HashMap<Integer, ArrayList<String>> hashMap = new HashMap<Integer,ArrayList<String>>();
		
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

		hashMap.put(1,arrList1);
		hashMap.put(2,arrList2);
		hashMap.put(3,arrList3);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			Integer key= iterator.next();
			ArrayList<String> value = hashMap.get(key);
			System.out.println("key:"+key+","+"value:"+value);
			
		}
	}
}
