<%@page import="pack1.Userbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>
<%
Userbean bean=(Userbean)session.getAttribute("ubean");

%>
<a href="AddCustomer.html">Add Customer</a><br><br>
<a href="viewCustomer.html">View Customer</a><br><br>
<a href="Logout.html">Logout</a><br><br>
</body>
</html>
