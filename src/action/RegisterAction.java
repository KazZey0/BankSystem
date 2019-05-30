package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserBasicDAO;

public class RegisterAction extends ActionSupport{

	private String account;
	private String printname;
	private String password;
	private UserBasicDAO dao;
	
	public String execute() throws Exception {
		System.out.println(account);
		System.out.println(password);
		
		if(account == null || password == null) return "error";

		if(dao.register(account, printname, password)){
			//reset content here
			this.account = null;
			this.printname = null;
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
	
	public String getPrintname() {
		return printname;
	}

	public void setPrintname(String printname) {
		this.printname = printname;
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