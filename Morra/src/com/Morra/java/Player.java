package com.Morra.java;

import java.util.Scanner;

/**
 * �����
 * 
 * �̳�Game���ԣ����� ����;������Ӯ�˼ӷ�
 * 
 * ��������ȭ
 * 
 * @author Administrator
 *
 */
public class Player extends Game{
	/**
	 * �����
	 * 
	 * ��ȭ��������ȭ
	 * @return
	 */
	Scanner sc = new Scanner(System.in);

	//ѡ���ȭ
	public String getFist() {

		System.out.println("���ȭ��1.����    2.ʯͷ   3.��(��������������룬��Ĭ����  ��)");
		String input = sc.next();

		if ("1".equals(input)) {
			System.out.println("�����  ����");
			return "����";
		} else if ("2".equals(input)) {
			System.out.println("�����  ʯͷ");
			return "ʯͷ";
		} else {
			System.out.println("�����  ��");
			return "��";
		}
	}
}