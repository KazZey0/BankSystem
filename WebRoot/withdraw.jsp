<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  <title>withdraw.jsp</title>
  </head>

  <body style="background-image:url(./images/background1.jpg)"> 
    <br> <br> <br> <br> <br>
    <div style="text-align:center;margin:0 auto;border:1px;background-color:#ffffff;border-radius:15px;width:450px;padding-top:5px;padding-bottom:5px ">
    <br>
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> 
    <s:form action="withdrawAction" method="post" theme="simple">
  取款金额: <s:textfield name="money"/><br>
  <br>
        <s:submit style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" value="确定"/><s:reset style="border-radius:10px;width:95px;height:60px;background-color:#acd6ff;font-weight:bold;font-size:18" value="重置"/>
    </s:form>
    <br>
    <div style = "text-align:left;padding-left:20px;padding-bottom:15px;">
    <input type="button" style="border-radius:10px;width:50px;height:30px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="back" value ="返回" onclick="window.location.href='statusAction.action'"/>
    <br>
    </div>
 <span style="color:red"> <%=request.getAttribute("notify")%></span> 
    
    </div>
    
  </body>
</html>