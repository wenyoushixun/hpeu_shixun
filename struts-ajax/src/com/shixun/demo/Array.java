package com.shixun.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();
		for (int i = 0; i < 3; i++) {
			inputstudent(arrayList);
		}
		System.out.println(arrayList);
		
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}

	public static Student inputstudent(ArrayList<Student> arrayList){
		
		System.out.println("请输入姓名！");
		String name=sc.next();
		System.out.println("请输入年龄！");
		String age=sc.next();
		System.out.println("请输入地址！");
		String address=sc.next();
		
		
		Student student= new Student(name,Integer.valueOf(age),address);
		arrayList.add(student);
		
		return student;
	}
}
