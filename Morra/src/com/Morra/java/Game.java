package com.Morra.java;

/**
 * ��Ϸ��
 * 
 * ���ԣ����� ����
 * 
 * ������Ӯ�˼ӷ�
 * 
 * @author Administrator
 *
 */
public class Game {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Ӯ�˼ӷ�
	public void win() {
		System.out.println("��ϲ" + name + "Ӯ�ˣ�");
		this.score++;
	}
}
