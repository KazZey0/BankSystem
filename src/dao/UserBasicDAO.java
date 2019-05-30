package dao;

public interface UserBasicDAO {
	public boolean login(String account,String password);
	public boolean register(String account, String printname, String password);
}
