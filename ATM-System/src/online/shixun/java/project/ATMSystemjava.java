package online.shixun.java.project;

import java.text.SimpleDateFormat;
import java.util.*;

public class ATMSystemjava {

	static Scanner scanner = new Scanner(System.in);

	private static String account[][] = new String[3][3];

	public static void main(String[] args) {
		// ��ӡ��ӭ����
		welcome();

		// ��ӡ��¼ƥ��
		int accountIndex = initAcount();

		// ��ȡ��ѯ����
		while (true) {
			// ��ӡ��ʾ��Ϣ
			meunIdcard();
			System.out.println("��������Ҫ�Ĳ�����");
			int menuId = scanner.nextInt();
			switch (menuId) {
			
			case 1:// ��ѯ���
				queryBalance(accountIndex);
				break;
			
			case 2:// ȡ��
				withdraw(accountIndex);
				break;
			
			case 3:// ���
				deposit( accountIndex);
				break;
			
			case 4:// ת��
				transfer(accountIndex);
				break;
			
			case 5:// �޸�����
				changePassword(accountIndex);
				break;
			
			case 0:// �˳�ϵͳ
				System.out.println("ϵͳ�˳��ɹ���");
				System.exit(0);
				break;
			
			default:// �Ƿ�����
				System.out.println("��Ч������");
				System.out.println("�밴����ʾ��Ϣ������Ҫ���������ݣ�");
				break;
			}

		}
	}

	/**
	 * ��ʼ���û��͵�¼ƥ�����
	 * @return
	 */
	public static int initAcount() {
		//��һλ�û�
		account[0][0] = "hello";//�û���
		account[0][1] = "123";//����
		account[0][2] = "1000";//���
		//�ڶ�λ�û�
		account[1][0] = "aaa";//�û���
		account[1][1] = "111";//����
		account[1][2] = "2000";//���
		//����λ�û�
		account[2][0] = "zzz";//�û���
		account[2][1] = "222";//����
		account[2][2] = "3000";//���

		/**
		 * ��¼��Ϣ
		 */
		int n;
		for (n = 5; n > 0; n--) {
			System.out.println("*******************************************");
			System.out.println("�������û�����");
			String user = scanner.next();
			System.out.println("���������룺");
			String password = scanner.next();

			int i;
			for (i = 0; i < account.length; i++) {
				if (account[i][0].equals(user) && account[i][1].equals(password)) {
					System.out.print("��л��" + (i + 1) + "λ�û�- " + user + "ʹ��--��¼ʱ��Ϊ��");
					Date date = new Date();
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
					System.out.println(format.format(date));
					return i;
				}
			}
			if (i == account.length) {
				System.out.println("�û������������");
				System.out.println("�㻹��" + (n - 1) + "���������");

			}

			if (n == 1) {
				System.out.println("�ף�����ϵ���й�����Ա��");
				System.out.println("���й�����Ա��ϵ�绰Ϊ��110--���������ԭ�صȺ�");
			}

		}
		System.exit(0);
		return 0;
	}

	/**
	 * ��ӭ����
	 */
	public static void welcome() {
		// ��ӭ����
		System.out.println("*******************************************");
		System.out.println("#####��ӭ����ʵѵ����#######");
		System.out.println("#####�밴����ʾ���в���######");
		System.out.println("*******************************************");
	}

	/**
	 * ʹ�ò˵�
	 * @return
	 */
	public static int meunIdcard() {
		// ��ʾ��Ϣ
		System.out.println("*******************************************");
		System.out.println("1-��ѯ���\t" + "2-ȡ��\t" + "3-���");
		System.out.println("4-ת��\t" + "5-�޸�����\t" + "0-�˳�ϵͳ");
		return 1;
	}

	/**
	 * �����ʾ
	 * @param accountIndex
	 */
	public static void queryBalance(int accountIndex) {
		//����ѯ
		System.out.println("��Ľ��Ϊ��" + account[accountIndex][2]);
	}
	
	/**
	 * ȡǮ��Ϣ
	 * @param accountIndex
	 */
	public static void withdraw(int accountIndex){
		//ȡ��
		do {
			System.out.println("��������Ҫȡ��Ľ�");
			int money = scanner.nextInt();
			int money1 = Integer.parseInt(account[accountIndex][2]);
			if (money > 0) {
				if (0 == money % 100) {
					if (money1 > money) {
						if (1000 >= money) {
							int money2 = money1 - money;
							account[accountIndex][2] = String.valueOf(money2);
							System.out.println("ȡ��ɹ���ллʹ�ã�");
							break;
						} else {
							System.out.println("һ�����ֻ��ȡ1000");
						}

					} else {
						System.out.println("������㣡");
					}
				} else {
					System.out.println("ȡ�ý�������100�ı�����");
				}
			} else {
				System.out.println("Ҫȡ�ý��������0��");
			}

		} while (true);
	}
	
	/**
	 * �����Ϣ
	 * @param accountIndex
	 */
	public static void deposit(int accountIndex){
		//���
		do {
			System.out.print("��������Ҫ���Ľ�");
			int money = scanner.nextInt();
			int money1 = Integer.parseInt(account[accountIndex][2]);
			if (money > 0) {
				if (0 == money % 100) {
					if (1000 >= money) {
						int money2 = money1 + money;
						account[accountIndex][2] = String.valueOf(money2);
						System.out.println("���ɹ���ллʹ�ã�");
						break;
					} else {
						System.out.println("һ�����ֻ�ܴ�1000");
					}
				} else {
					System.out.println("��ý�������100�ı�����");
				}
			} else {
				System.out.println("Ҫ��ý��������0��");
			}

		} while (true);
	}
	
	/**
	 * ת����Ϣ
	 * @param accountIndex
	 */
	public static void transfer(int accountIndex){
		//ת��
		System.out.println("������Ҫת���˵��˺ţ�");
		String username = scanner.next();

		for (int i = 0; i < account.length; i++) {
			if (account[i][0].equals(username)) {
				if (account[accountIndex][0].equals(username)) {
					continue;
				}

				System.out.println("������Ҫת�˵Ľ�");
				int money = scanner.nextInt();
				int money1 = Integer.parseInt(account[accountIndex][2]);
				if (money > 0) {
					if (money < money1) {
						System.out.println("ת�˳ɹ���");
						int money2 = money1 - money;
						account[accountIndex][2] = String.valueOf(money2);
					} else {
						System.out.println("���㣬����ת��");
					}
					break;
				}
				System.out.println("ת�˽��������0");
				break;
			}

			if ((i + 1) == account.length) {
				System.out.println("ת�˵��˻������ڣ�");
			}

		}
	}
	
	/**
	 * �޸�����
	 * @param accountIndex
	 */
	public static void changePassword(int accountIndex){
		//�޸�����
		System.out.println("*******************************************");
		System.out.println("�������û�����");
		String user = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();

		if (account[accountIndex][0].equals(user) && account[accountIndex][1].equals(password)) {
			System.out.println("�����������룺");
			String password1 = scanner.next();
			System.out.println("���ٴ���������");
			String password2 = scanner.next();
			if (password1.equals(password2)) {
				System.out.println("�޸�����ɹ�,������Ϊ��" + password2);
			} else {
				System.out.println("�޸�����ʧ�ܣ��������벻һ����");
			}
		} else {
			System.out.println("������󣬲����޸�");
		}
	}
	
	
}
