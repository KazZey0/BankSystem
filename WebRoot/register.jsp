<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  <title>login.jsp</title>
  
  </head>

  <body style="background-image:url(./images/background1.jpg)"> 
    <br> <br> <br> <br> <br>
    <div style="text-align:center;margin:0 auto;border:1px;background-color:#ffffff;border-radius:15px;width:450px;padding-top:5px;padding-bottom:5px ">
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> <br>
    <s:form action="registerAction" method="post" theme="simple">
        账户：<s:textfield name="account"/><br>
        姓名：<s:textfield name="printname"/><br>
        密码：<s:password name="password"/><br>
        <br><br>
        <s:submit value="注册" style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18"/><s:reset style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" value="重置"/>
    </s:form>
    <br><div style = "text-align:left;padding-left:20px;padding-bottom:15px;">
    <input type="button" style="border-radius:10px;width:70px;height:30px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="back" value ="返回" onclick="window.location.href='indexAction.action'"/>
    <br>
    </div>
    
    </div>
    
  </body>
</html>