package service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import dao.Account;
import dao.BaseDao;
import dao.User;
import dao.UserBasicDAO;

public class UserLogin extends BaseDao implements UserBasicDAO{
	@Override
	public boolean login(String account, String password) {
		Session session = getSession();
		try {
			String hql="from User where userName = ? and userPass = ?";
			Query query  = session.createQuery(hql);
			query.setString(0, account);
			query.setString(1, password);
			//System.out.println(query.list().size());
			
			Map<String,Object> mysession = ActionContext.getContext().getSession();
			
			if(query.list().size()>0){
				mysession.put("user", query.list().get(0));
				HttpServletRequest request=ServletActionContext.getRequest();
		    	User guest = (User)mysession.get("user");
		    	request.setAttribute("username",guest.getPrintName());
				System.out.println(query.list().get(0));
				
				session.close();
				return true;
			}
			session.close();
			return false;
		}
		catch (Exception e){
			System.out.println("login error");
			session.close();
			return false;
		}
	}

	@Override
	public boolean register(String account, String printname, String password) {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("notify", " ");
		Session session = getSession();
		try{
			
			User usr = new User();
			usr.setUserName(account);
			usr.setPrintName(printname);
			usr.setUserPass(password);
			
			System.out.println(usr.getPrintName());
			Account acc = new Account();
			acc.setAccountBalance(0.0);
			
			Transaction tran=session.beginTransaction();
			session.save(acc);  
			
			usr.setAccount(acc);
			session.save(usr);
			tran.commit();
			
			session.close();
			
			request.setAttribute("notify", "×¢²á³É¹¦£¡");
			
			
			return true;
		}
		catch (Exception e){
			session.close();
			return false;
		}
	}
}
