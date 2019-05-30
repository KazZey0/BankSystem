package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountBasicDAO;

public class DepositAction extends ActionSupport{
	private String money;
	private AccountBasicDAO dao;
	
	
	public String execute() throws Exception {
		
		if(dao.deposit(money)){
			this.money = null;
			return "success";
		} else {
			return "error";
		}
	}
	
	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	public AccountBasicDAO getDao() {
		return dao;
	}

	public void setDao(AccountBasicDAO dao) {
		this.dao = dao;
	}
	
}
