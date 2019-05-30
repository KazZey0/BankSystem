package action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{
    public String execute(){
        return "success";
    }
    public String error(){
        return "error";
    }
}