package com.Morra.java;

/**
 * 游戏类
 * 
 * 属性：姓名 分数
 * 
 * 方法：赢了加分
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

	// 赢了加分
	public void win() {
		System.out.println("恭喜" + name + "赢了！");
		this.score++;
	}
}
