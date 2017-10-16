package com.Morra.java;

import java.util.Random;

/**
 * 电脑类
 * 
 * 继承Game属性：姓名 分数;方法：赢了加分
 * 
 * 方法：随机出拳
 * 
 * @author Administrator
 *
 */
public class Computer extends Game {

	// 电脑随机出拳
	public String getFist() {
		Random random = new Random();
		String fists[] = { "石头", "剪刀", "布" };
		int randomName = random.nextInt(3);
		System.out.println("电脑出的是：" + fists[randomName]);
		return fists[randomName];
	}

}