package service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import dao.BaseDao;
import dao.HistoryBasicDAO;
import dao.Transactions;
import dao.User;

public class QueryHistory extends BaseDao implements HistoryBasicDAO {

	@Override
	public boolean getHistory() {
		// TODO Auto-generated method stub
		
		Session session = getSession();
		try{
			Map<String,Object> mysession = ActionContext.getContext().getSession();
			User usr = (User) mysession.get("user");
			Integer usrid = usr.getUserId();
			System.out.println(usrid);
			
			String hql="from Transactions where transUserId = ?";
			Query query  = session.createQuery(hql);
			query.setInteger(0, usrid);
			
			System.out.println("begin convertion");
			
			if(query.list().size()>0){
				List<Transactions> ll = (List<Transactions>) query.list();
				HttpServletRequest request=ServletActionContext.getRequest();
				request.setAttribute("notify"," ");
		    	System.out.println(request.getAttribute("username"));
		    	request.setAttribute("historyList",query.list());	
		    	session.close();
				return true;
			}
			session.close();
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("notify","您没有历史交易");
			return true;
		}
		catch (Exception e){
			System.out.println("error");
			e.printStackTrace();
			session.close();
			return false;
		}
		
	}

}
