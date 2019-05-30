package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.HistoryBasicDAO;
import dao.UserBasicDAO;;

public class HistoryAction extends ActionSupport{
	HistoryBasicDAO dao;
	
	public String execute() throws Exception {
		if(dao.getHistory()){
			return "success";
		} else {
			return "error";
		}
	}
	
    public String error(){
        return "error";
    }
    
	public HistoryBasicDAO getDao() {
		return dao;
	}

	public void setDao(HistoryBasicDAO dao) {
		this.dao = dao;
	}
    
}