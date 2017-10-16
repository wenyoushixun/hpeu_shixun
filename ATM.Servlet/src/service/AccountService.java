package service;

public interface AccountService {

	void initAccounts();
	
	int login(String inputName,String inputPassword);
	
	double queryBalance(int accountIndex);
	
	double deposit(int accountIndex,double depositAmount);
	
	double withdraw(int accountIndex,double withdrawAmount);
	
	double changepassword(int accountIndex,String password,String changepassword);
	
	double transfer(int accountIndex,String inputName,double transfer);
}
