<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

	

  </head>
  
  <body style="background-image:url(./images/background1.jpg)"> 
     <br> <br> <br> <br> <br>
    <div style="text-align:center;margin:0 auto;border:1px;background-color:#ffffff;border-radius:15px;width:450px;padding-top:5px;padding-bottom:5px ">
    <br>
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> <br>
    <h3 style="text-align:center;border:1px;"> 欢迎光临！ </h3>
    <input type="button" style="border-radius:10px;width:100px;height:70px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="register" value ="请先登录" onclick="window.location.href='loginAction.action'"/>
    <input type="button" style="border-radius:10px;width:100px;height:70px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="register" value ="马上注册" onclick="window.location.href='registerAction.action'"/>
    <br> <br>
    
    </div>
    
  </body>
</html>
