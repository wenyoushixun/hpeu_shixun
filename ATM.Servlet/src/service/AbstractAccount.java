package service;

import model.Account;

/**
 * �˻�������
 * 
 * @author Administrator
 *
 */
public abstract class AbstractAccount implements AccountService {

	// �����˻�
	protected static Account[] accounts = new Account[2];

	/**
	 * ��ʼ���˻���Ϣ���û�����ģ�����ݿ⣬�����˻���Ϣ
	 */
	public void initAccounts() {
		// ��һ���˻�
		Account account1 = new Account();
		account1.setName("hello");
		account1.setPassword("123");
		account1.setBalance(500);
		accounts[0] = account1;

		// �ڶ����˻�
		Account account2 = new Account();
		account2.setName("shixun");
		account2.setPassword("456");
		account2.setBalance(500);
		accounts[1] = account2;
	}

}
