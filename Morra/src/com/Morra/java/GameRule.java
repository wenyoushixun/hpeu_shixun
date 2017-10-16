package com.Morra.java;

import java.util.Scanner;

/**
 * 游戏类
 * 控制游戏的有效进行
 * @author Administrator
 *
 */
public class GameRule {

	private Player player = new Player();

	private Computer computer = new Computer();

	String inputt = "";

	int times;

	Scanner sc = new Scanner(System.in);

	//创建角色
	private void chooseGameRole() {

		// 选择对手
		chooseComputerRole();
		
		// 输入你的名字
		choosePlayerRole();

		//打印两位对手名字
		System.out.println("*************************************");
		System.out.println(player.getName() + "VS" + computer.getName());
	}

	// 是否循环猜拳
	private void getFist() {

		do {
			//猜拳
			fist();

			System.out.println("是否继续，输入y继续，输入其它退出系统");
			System.out.println("*************************************");
			inputt = sc.next();
			
			//纪录玩家玩了多少场
			times++;
		} while ("y".equals(inputt));

		//结束游戏打印游戏纪录
		System.out.println("你玩了" + times + "场");
		System.out.println("名字\t" + "得分");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(computer.getName() + "\t" + computer.getScore());
		System.out.println("系统已退出！");
		System.exit(0);
	}

	//// 欢迎login
	public static void welcome() {

		System.out.println("-------欢迎来到游戏世界-------");
		System.out.println("***************************");
		System.out.println("*******人机互动猜拳游戏*********");
		System.out.println("***************************");
		System.out.println("出拳规则：1.剪刀    2.石头   3.布");
	}

	// 输入你的名字
	public void choosePlayerRole() {
		
		System.out.println("输入你的名字：");
		String playerName = sc.next();
		player.setName(playerName);
	}

	// 选择对手
	public void chooseComputerRole() {
		
		System.out.println("请选择对手：");
		System.out.println("1.刘备    2.孙权  3.曹操");
		String input = sc.next();

		if ("1".equals(input)) {
			System.out.println("你选择了刘备");
			computer.setName("刘备");
		} else if ("2".equals(input)) {
			System.out.println("你选择了孙权");
			computer.setName("孙权");
		} else {
			System.out.println("你选择了曹操");
			computer.setName("曹操");
		}
	}

	// 判断猜拳输赢
	public void fist() {
		
		String playerFist = player.getFist();
		String computerFist = computer.getFist();
		if (playerFist.equals(computerFist)) {
			System.out.println("打平了！");
		} else if ("剪刀".equals(playerFist) && "布".equals(computerFist)
				|| "石头".equals(playerFist) && "剪刀".equals(computerFist)
				|| "布".equals(playerFist) && "石头".equals(computerFist)) {
			player.win();
		} else {
			computer.win();
		}
	}

	/**
	 * 开始运行
	 */
	public void start() {
		
		// 欢迎login
		welcome();

		// 角色选择和名字输入
		chooseGameRole();
		
		// 进行猜拳
		getFist();
	}
}
