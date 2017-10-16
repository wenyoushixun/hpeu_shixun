package com.Morra.java;

import java.util.Scanner;

/**
 * ��Ϸ��
 * ������Ϸ����Ч����
 * @author Administrator
 *
 */
public class GameRule {

	private Player player = new Player();

	private Computer computer = new Computer();

	String inputt = "";

	int times;

	Scanner sc = new Scanner(System.in);

	//������ɫ
	private void chooseGameRole() {

		// ѡ�����
		chooseComputerRole();
		
		// �����������
		choosePlayerRole();

		//��ӡ��λ��������
		System.out.println("*************************************");
		System.out.println(player.getName() + "VS" + computer.getName());
	}

	// �Ƿ�ѭ����ȭ
	private void getFist() {

		do {
			//��ȭ
			fist();

			System.out.println("�Ƿ����������y���������������˳�ϵͳ");
			System.out.println("*************************************");
			inputt = sc.next();
			
			//��¼������˶��ٳ�
			times++;
		} while ("y".equals(inputt));

		//������Ϸ��ӡ��Ϸ��¼
		System.out.println("������" + times + "��");
		System.out.println("����\t" + "�÷�");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(computer.getName() + "\t" + computer.getScore());
		System.out.println("ϵͳ���˳���");
		System.exit(0);
	}

	//// ��ӭlogin
	public static void welcome() {

		System.out.println("-------��ӭ������Ϸ����-------");
		System.out.println("***************************");
		System.out.println("*******�˻�������ȭ��Ϸ*********");
		System.out.println("***************************");
		System.out.println("��ȭ����1.����    2.ʯͷ   3.��");
	}

	// �����������
	public void choosePlayerRole() {
		
		System.out.println("����������֣�");
		String playerName = sc.next();
		player.setName(playerName);
	}

	// ѡ�����
	public void chooseComputerRole() {
		
		System.out.println("��ѡ����֣�");
		System.out.println("1.����    2.��Ȩ  3.�ܲ�");
		String input = sc.next();

		if ("1".equals(input)) {
			System.out.println("��ѡ��������");
			computer.setName("����");
		} else if ("2".equals(input)) {
			System.out.println("��ѡ������Ȩ");
			computer.setName("��Ȩ");
		} else {
			System.out.println("��ѡ���˲ܲ�");
			computer.setName("�ܲ�");
		}
	}

	// �жϲ�ȭ��Ӯ
	public void fist() {
		
		String playerFist = player.getFist();
		String computerFist = computer.getFist();
		if (playerFist.equals(computerFist)) {
			System.out.println("��ƽ�ˣ�");
		} else if ("����".equals(playerFist) && "��".equals(computerFist)
				|| "ʯͷ".equals(playerFist) && "����".equals(computerFist)
				|| "��".equals(playerFist) && "ʯͷ".equals(computerFist)) {
			player.win();
		} else {
			computer.win();
		}
	}

	/**
	 * ��ʼ����
	 */
	public void start() {
		
		// ��ӭlogin
		welcome();

		// ��ɫѡ�����������
		chooseGameRole();
		
		// ���в�ȭ
		getFist();
	}
}
