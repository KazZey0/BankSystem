<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  
    
  <body style="background-image:url(./images/background1.jpg)"> 
  <br> <br> <br> <br> <br>
    <div style="text-align:center;margin:0 auto;border:1px;background-color:#ffffff;border-radius:15px;width:450px;padding-top:5px;padding-bottom:5px ">
    <br>
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> 
    <h3 style="text-align:center;border:1px "> 用户 <%=request.getAttribute("username")%> 您好! </h3>  
    
    <input type="button" name="register" value ="查询余额" style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" onclick="window.location.href='statusAction.action'"/>
    <input type="button" name="register" value ="存款" style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" onclick="window.location.href='depositAction.action'"/>
    <input type="button" name="register" value ="取款" style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" onclick="window.location.href='withdrawAction.action'"/>
    <input type="button" name="register" value ="查询记录" style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" onclick="window.location.href='historyAction.action'"/>
    <br><br><div style = "text-align:left;padding-left:20px;padding-bottom:15px;">
    <input type="button" style="border-radius:10px;width:100px;height:27px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="back" value ="退出登录" onclick="window.location.href='historyAction.action'"/>
    <br>
    </div>
    </div>
    
    
  </body>
</html>
