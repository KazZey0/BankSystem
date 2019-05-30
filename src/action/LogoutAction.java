package action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{
    public String execute(){
    	System.out.println("user exit");

    	HttpServletRequest request = ServletActionContext.getRequest();
    	request.getSession().invalidate();//���session
    	Cookie cookie = request.getCookies()[0];//��ȡcookie
    	cookie.setMaxAge(0);//��cookie����
    	System.out.println("user exit end");
        return "success";
    }
    public String error(){
        return "error";
    }
}