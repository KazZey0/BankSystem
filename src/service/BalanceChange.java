package service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import dao.Account;
import dao.AccountBasicDAO;
import dao.BaseDao;
import dao.Transactions;
import dao.User;

public class BalanceChange extends BaseDao implements AccountBasicDAO{

	@Override
	public boolean deposit(String money) {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("notify", " ");
		
		if (money == null) {
			request.setAttribute("notify", " ");
			return false;
		}
		if (money.length() == 0) {
			request.setAttribute("notify", "请输入存款金额");
			return false;
		}
		
		Session session = getSession();
		try {
		
			Double dmoney = Double.valueOf(money);
			System.out.println(dmoney);
			
			// could do some check here.
			if ( Double.compare(dmoney, 0) <= 0) {
				System.out.println("negtive money");
				request.setAttribute("notify", "请输入大于0的金额");
				session.close();
				return false;
			}
			
			System.out.println("regular money");
			// calculate the final balance
			
			Map<String,Object> mysession = ActionContext.getContext().getSession();
	    	User guest = (User)mysession.get("user");
	    	Account useraccount = guest.getAccount();
			Double prevalue = useraccount.getAccountBalance();
			Double newvalue = prevalue + dmoney;
			Integer accid = useraccount.getAccountId();
			System.out.println(newvalue);
			
			// update account balance
			String hql="update Account ac set ac.accountBalance = ? where ac.accountId = ?";
			Query query  = session.createQuery(hql);
			query.setDouble(0, newvalue);
			query.setInteger(1, accid);
			query.executeUpdate();
			
			
			// save to record. Transactions is my own class. Transaction is a library class
			Transactions ts = new Transactions();
			ts.setTransAction("存款");
			ts.setTransUserId(guest.getUserId());
			ts.setTransValue(dmoney);
			
			Transaction tran=session.beginTransaction();
			session.save(ts); 
			
			tran.commit();
			session.close();
			// also update the record in session
			useraccount.setAccountBalance(newvalue);
			
			request.setAttribute("notify", "存款成功");
			
			
			return true;
			
		} catch (Exception e){
			session.close();
			e.printStackTrace();
			request.setAttribute("notify", "请输入合理的金额数字");
			return false;
		}
	}

	@Override
	public boolean withdraw(String money) {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("notify", " ");
		
		if (money == null) {
			request.setAttribute("notify", " ");
			return false;
		}
		if (money.length() == 0) {
			request.setAttribute("notify", "请输入取款金额");
			return false;
		}
		
		Session session = getSession();
		try {
		
			Double dmoney = Double.valueOf(money);
			System.out.println(dmoney);
			
			// could do some check here.
			if ( Double.compare(dmoney, 0) <= 0) {
				System.out.println("negtive money");
				request.setAttribute("notify", "请输入大于0的金额");
				session.close();
				return false;
			}
			
			System.out.println("regular money");
			// calculate the final balance
			
			Map<String,Object> mysession = ActionContext.getContext().getSession();
	    	User guest = (User)mysession.get("user");
	    	Account useraccount = guest.getAccount();
			Double prevalue = useraccount.getAccountBalance();
			Double newvalue = prevalue - dmoney;
			
			if ( Double.compare(newvalue, 0) < 0) {
				System.out.println("negtive money");
				request.setAttribute("notify", "请输入小于已有存款的金额");
				session.close();
				return false;
			}
			
			Integer accid = useraccount.getAccountId();
			System.out.println(newvalue);
			
			// update balance
			
			String hql="update Account ac set ac.accountBalance = ? where ac.accountId = ?";
			Query query  = session.createQuery(hql);
			query.setDouble(0, newvalue);
			query.setInteger(1, accid);
			query.executeUpdate();
			
			// save to record. 
			Transactions ts = new Transactions();
			ts.setTransAction("取款");
			ts.setTransUserId(guest.getUserId());
			ts.setTransValue(dmoney);
			
			Transaction tran=session.beginTransaction();
			session.save(ts); 
			
			tran.commit();
			session.close();
			
			// also update the record in session
			useraccount.setAccountBalance(newvalue);
			
			request.setAttribute("notify", "取款成功");
			
			return true;
			
		} catch (Exception e){
			session.close();
			e.printStackTrace();
			request.setAttribute("notify", "请输入合理的金额数字");
			return false;
		}
	}

	@Override
	public boolean getstatus() {
		// TODO Auto-generated method stub
		
		//System.out.println(query.list().size());
		Session session = getSession();
		try{
			Map<String,Object> mysession = ActionContext.getContext().getSession();
			User usr = (User) mysession.get("user");
			Account acc = usr.getAccount();
			Integer accid = acc.getAccountId();
			System.out.println(usr.getUserId());
			System.out.println(accid);
			
			
			String hql="from Account where accountId = ?";
			Query query  = session.createQuery(hql);
			query.setInteger(0, accid);
			
			if(query.list().size()>0){
				
				acc = (Account) query.list().get(0);
				usr.setAccount(acc);
				mysession.put("user", usr);
				
				HttpServletRequest request=ServletActionContext.getRequest();
				request.setAttribute("username",usr.getPrintName());
		    	System.out.println(request.getAttribute("username"));
		    	request.setAttribute("accbalance",acc.getAccountBalance());
		    	System.out.println(request.getAttribute("accbalance"));
		    	session.close();
				return true;
			}
			session.close();
			return false;
		}
		catch (Exception e){
			System.out.println("error");
			session.close();
			return false;
		}
		
	}
	

}
