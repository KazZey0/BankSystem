<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  <title>history.jsp</title>
  </head>

<body style="background-image:url(./images/background1.jpg)"> 
    <br> <br> <br> <br> <br>
    <div style="text-align:center;margin:0 auto;border:1px;background-color:#ffffff;border-radius:15px;width:450px;padding-top:5px;padding-bottom:5px ">
    <br>
    <h1 style="text-align:center;border:1px;"> 某银行在线存取款系统 </h1> 
	<div style="text-align:center;">



	<table style="margin:0 auto;" border="1">
		<tr align="center">
		  <th style="width:120px">交易编号</th>
		  <th style="width:90px">类型</th>
		  <th style="width:120px">金额</th>
		</tr>
		
		<s:iterator value="#request.historyList" status="stat" id="Transactions">
			<tr align="center">
				<td>
					<s:property value="transId"></s:property>
				</td>
				<td>
					<s:property value="transAction"></s:property>
				</td>
				<td>
					<s:property value="transValue"></s:property>
				</td>
			</tr>
		</s:iterator>
	</table>
	</div>
    <br>
    <div style = "text-align:left;padding-left:20px;padding-bottom:15px;">
    <input type="button" style="border-radius:10px;width:50px;height:30px;font-weight:bold;font-size:18;background-color:#acd6ff;" name="back" value ="返回" onclick="window.location.href='statusAction.action'"/>
    <br>
    </div>
 <span style="color:red"> <%=request.getAttribute("notify")%></span>  
    
    </div>
    
  </body>
</html>