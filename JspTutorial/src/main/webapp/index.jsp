<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HelloWorld</h1>
<h1>Declaration Tag:</h1>
<% int a=10;String name="becoder"; %>
<h1>Expressoin Tag:<%= a %><%=name %>

<%
int sum=20+30;
out.print(sum);
int sub=30-20;
out.print(sub);
%>



</h1>
<h1>Time=<%=new Date().toString() %></h1>
</body>
</html>