package dao;

public interface AccountBasicDAO {
	public boolean deposit(String money);
	public boolean withdraw(String money);
	public boolean getstatus();
}
