<%@page import="pack1.Userbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center><h1>
<% 
Userbean userbean=(Userbean)session.getAttribute("userbean");
out.println("Welcome Mr"+userbean+"<br><br>");
%>


</body>
</html>