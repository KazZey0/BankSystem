package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.Account;
import dao.User;
import dao.UserBasicDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String account;
	private String password;
	private UserBasicDAO dao;
	
	public String execute() throws Exception {
		System.out.println(account);
		System.out.println(password);

		if(dao.login(account, password)){
			//reset content here
			this.account = null;
			this.password = null;
			return "success";
		} else {
			return "error";
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserBasicDAO getDao() {
		return dao;
	}

	public void setDao(UserBasicDAO dao) {
		this.dao = dao;
	}
}
