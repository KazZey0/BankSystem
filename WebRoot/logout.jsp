<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Logout now</title>
    
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
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> <br>
    成功退出! <br>
    </div>
  </body>
</html>
