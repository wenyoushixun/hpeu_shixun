package service;

import model.Account;

/**
 * 账户抽象类
 * 
 * @author Administrator
 *
 */
public abstract class AbstractAccount implements AccountService {

	// 银行账户
	protected static Account[] accounts = new Account[2];

	/**
	 * 初始化账户信息，用户数组模拟数据库，储存账户信息
	 */
	public void initAccounts() {
		// 第一个账户
		Account account1 = new Account();
		account1.setName("hello");
		account1.setPassword("123");
		account1.setBalance(500);
		accounts[0] = account1;

		// 第二个账户
		Account account2 = new Account();
		account2.setName("shixun");
		account2.setPassword("456");
		account2.setBalance(500);
		accounts[1] = account2;
	}

}
