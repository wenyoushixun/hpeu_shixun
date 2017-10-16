package com.Morra.java;

import java.util.Scanner;

/**
 * 玩家类
 * 
 * 继承Game属性：姓名 分数;方法：赢了加分
 * 
 * 方法：出拳
 * 
 * @author Administrator
 *
 */
public class Player extends Game{
	/**
	 * 玩家类
	 * 
	 * 出拳方法：出拳
	 * @return
	 */
	Scanner sc = new Scanner(System.in);

	//选择出拳
	public String getFist() {

		System.out.println("请出拳：1.剪刀    2.石头   3.布(如果不按规则输入，则默认是  布)");
		String input = sc.next();

		if ("1".equals(input)) {
			System.out.println("你出的  剪刀");
			return "剪刀";
		} else if ("2".equals(input)) {
			System.out.println("你出的  石头");
			return "石头";
		} else {
			System.out.println("你出的  布");
			return "布";
		}
	}
}