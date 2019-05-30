package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.Account;
import dao.AccountBasicDAO;
import dao.User;
import dao.UserBasicDAO;
import util.HibernateSessionFactory;

public class StatusAction extends ActionSupport{
	private AccountBasicDAO dao;
	
	public String execute() throws Exception {
		if (dao.getstatus()){
			return "success";
		} else {
			return "error";
		}
		
		
	}
    public String error(){
        return "error";
    }
    
    public String display(){
    	
    	try{
    		System.out.println("init");
	    	HttpServletRequest request=ServletActionContext.getRequest();
	    	Map<String,Object> mysession = ActionContext.getContext().getSession();
	    	User guest = (User)mysession.get("user");
	    	request.setAttribute("username",guest.getUserName());
	    	System.out.println(request.getAttribute("username"));
	    	request.setAttribute("account",guest.getAccount());
	    	System.out.println(request.getAttribute("account"));
	    	Account useraccount = guest.getAccount();
	    	request.setAttribute("accbalance",useraccount.getAccountBalance());
	    	System.out.println(request.getAttribute("accbalance"));
	    	
	    	return "success";
    	} catch (Exception e){
    		System.out.println(e);
    		return "error";
    	}
    }
    
    public AccountBasicDAO getDao() {
		return dao;
	}

	public void setDao(AccountBasicDAO dao) {
		this.dao = dao;
	}
    
}
