package online.shixun.java.project;

import java.text.SimpleDateFormat;
import java.util.*;

public class ATMSystemjava {

	static Scanner scanner = new Scanner(System.in);

	private static String account[][] = new String[3][3];

	public static void main(String[] args) {
		// 打印欢迎界面
		welcome();

		// 打印登录匹配
		int accountIndex = initAcount();

		// 存取查询操作
		while (true) {
			// 打印提示信息
			meunIdcard();
			System.out.println("请输入你要的操作：");
			int menuId = scanner.nextInt();
			switch (menuId) {
			
			case 1:// 查询余额
				queryBalance(accountIndex);
				break;
			
			case 2:// 取款
				withdraw(accountIndex);
				break;
			
			case 3:// 存款
				deposit( accountIndex);
				break;
			
			case 4:// 转账
				transfer(accountIndex);
				break;
			
			case 5:// 修改密码
				changePassword(accountIndex);
				break;
			
			case 0:// 退出系统
				System.out.println("系统退出成功！");
				System.exit(0);
				break;
			
			default:// 非法输入
				System.out.println("无效操作！");
				System.out.println("请按照提示信息输入你要操作的内容！");
				break;
			}

		}
	}

	/**
	 * 初始化用户和登录匹配界面
	 * @return
	 */
	public static int initAcount() {
		//第一位用户
		account[0][0] = "hello";//用户名
		account[0][1] = "123";//密码
		account[0][2] = "1000";//余额
		//第二位用户
		account[1][0] = "aaa";//用户名
		account[1][1] = "111";//密码
		account[1][2] = "2000";//余额
		//第三位用户
		account[2][0] = "zzz";//用户名
		account[2][1] = "222";//密码
		account[2][2] = "3000";//余额

		/**
		 * 登录信息
		 */
		int n;
		for (n = 5; n > 0; n--) {
			System.out.println("*******************************************");
			System.out.println("请输入用户名：");
			String user = scanner.next();
			System.out.println("请输入密码：");
			String password = scanner.next();

			int i;
			for (i = 0; i < account.length; i++) {
				if (account[i][0].equals(user) && account[i][1].equals(password)) {
					System.out.print("感谢第" + (i + 1) + "位用户- " + user + "使用--登录时间为：");
					Date date = new Date();
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
					System.out.println(format.format(date));
					return i;
				}
			}
			if (i == account.length) {
				System.out.println("用户名或密码错误！");
				System.out.println("你还有" + (n - 1) + "次输入机会");

			}

			if (n == 1) {
				System.out.println("亲！请联系银行工作人员。");
				System.out.println("银行工作人员联系电话为：110--拨打后请在原地等候");
			}

		}
		System.exit(0);
		return 0;
	}

	/**
	 * 欢迎界面
	 */
	public static void welcome() {
		// 欢迎界面
		System.out.println("*******************************************");
		System.out.println("#####欢迎来到实训银行#######");
		System.out.println("#####请按照提示进行操作######");
		System.out.println("*******************************************");
	}

	/**
	 * 使用菜单
	 * @return
	 */
	public static int meunIdcard() {
		// 提示信息
		System.out.println("*******************************************");
		System.out.println("1-查询余额\t" + "2-取款\t" + "3-存款");
		System.out.println("4-转账\t" + "5-修改密码\t" + "0-退出系统");
		return 1;
	}

	/**
	 * 余额显示
	 * @param accountIndex
	 */
	public static void queryBalance(int accountIndex) {
		//余额查询
		System.out.println("你的金额为：" + account[accountIndex][2]);
	}
	
	/**
	 * 取钱信息
	 * @param accountIndex
	 */
	public static void withdraw(int accountIndex){
		//取款
		do {
			System.out.println("请输入你要取款的金额：");
			int money = scanner.nextInt();
			int money1 = Integer.parseInt(account[accountIndex][2]);
			if (money > 0) {
				if (0 == money % 100) {
					if (money1 > money) {
						if (1000 >= money) {
							int money2 = money1 - money;
							account[accountIndex][2] = String.valueOf(money2);
							System.out.println("取款成功，谢谢使用！");
							break;
						} else {
							System.out.println("一次最多只能取1000");
						}

					} else {
						System.out.println("你的余额不足！");
					}
				} else {
					System.out.println("取得金额必须是100的倍数！");
				}
			} else {
				System.out.println("要取得金额必须大于0！");
			}

		} while (true);
	}
	
	/**
	 * 存款信息
	 * @param accountIndex
	 */
	public static void deposit(int accountIndex){
		//存款
		do {
			System.out.print("请输入你要存款的金额：");
			int money = scanner.nextInt();
			int money1 = Integer.parseInt(account[accountIndex][2]);
			if (money > 0) {
				if (0 == money % 100) {
					if (1000 >= money) {
						int money2 = money1 + money;
						account[accountIndex][2] = String.valueOf(money2);
						System.out.println("存款成功，谢谢使用！");
						break;
					} else {
						System.out.println("一次最多只能存1000");
					}
				} else {
					System.out.println("存得金额必须是100的倍数！");
				}
			} else {
				System.out.println("要存得金额必须大于0！");
			}

		} while (true);
	}
	
	/**
	 * 转账信息
	 * @param accountIndex
	 */
	public static void transfer(int accountIndex){
		//转账
		System.out.println("请输入要转入人的账号：");
		String username = scanner.next();

		for (int i = 0; i < account.length; i++) {
			if (account[i][0].equals(username)) {
				if (account[accountIndex][0].equals(username)) {
					continue;
				}

				System.out.println("请输入要转账的金额：");
				int money = scanner.nextInt();
				int money1 = Integer.parseInt(account[accountIndex][2]);
				if (money > 0) {
					if (money < money1) {
						System.out.println("转账成功。");
						int money2 = money1 - money;
						account[accountIndex][2] = String.valueOf(money2);
					} else {
						System.out.println("余额不足，不能转账");
					}
					break;
				}
				System.out.println("转账金额必须大于0");
				break;
			}

			if ((i + 1) == account.length) {
				System.out.println("转账的账户不存在！");
			}

		}
	}
	
	/**
	 * 修改密码
	 * @param accountIndex
	 */
	public static void changePassword(int accountIndex){
		//修改密码
		System.out.println("*******************************************");
		System.out.println("请输入用户名：");
		String user = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();

		if (account[accountIndex][0].equals(user) && account[accountIndex][1].equals(password)) {
			System.out.println("请输入新密码：");
			String password1 = scanner.next();
			System.out.println("请再次输入密码");
			String password2 = scanner.next();
			if (password1.equals(password2)) {
				System.out.println("修改密码成功,新密码为：" + password2);
			} else {
				System.out.println("修改密码失败！两次密码不一样！");
			}
		} else {
			System.out.println("密码错误，不能修改");
		}
	}
	
	
}
