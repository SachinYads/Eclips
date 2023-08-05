<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored= "false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--<%

String name=(String)request.getAttribute("name");
Integer rollno=(Integer)request.getAttribute("roll no.");

--%>
<h1> My Name is ${name}<%--<%=name --%> </h1>
<h1> My rollnumber is 

${rollnumber}<%--<%=rollno --%> </h1>
<hr>
<c:forEach var="item" items="${marks }">
<h1>${item}</h1>




</c:forEach>

</body>
</html>