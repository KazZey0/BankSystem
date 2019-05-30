package action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{
    public String execute(){
    	System.out.println("user exit");

    	HttpServletRequest request = ServletActionContext.getRequest();
    	request.getSession().invalidate();//清空session
    	Cookie cookie = request.getCookies()[0];//获取cookie
    	cookie.setMaxAge(0);//让cookie过期
    	System.out.println("user exit end");
        return "success";
    }
    public String error(){
        return "error";
    }
}