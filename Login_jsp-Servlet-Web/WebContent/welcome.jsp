<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String password=(String)request.getAttribute("password");
%>
<%
String remember=(String)request.getAttribute("remember");
%>


<h6>用户名：${name }</h6>
<h6>密码：<%=password %></h6>
<h6>记住密码：<%=remember %></h6>


</body>
</html>