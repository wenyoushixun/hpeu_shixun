package com.Morra.java;

import java.util.Random;

/**
 * ������
 * 
 * �̳�Game���ԣ����� ����;������Ӯ�˼ӷ�
 * 
 * �����������ȭ
 * 
 * @author Administrator
 *
 */
public class Computer extends Game {

	// ���������ȭ
	public String getFist() {
		Random random = new Random();
		String fists[] = { "ʯͷ", "����", "��" };
		int randomName = random.nextInt(3);
		System.out.println("���Գ����ǣ�" + fists[randomName]);
		return fists[randomName];
	}

}