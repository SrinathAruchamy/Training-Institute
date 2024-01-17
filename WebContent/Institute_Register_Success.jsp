<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Institute</title>
</head>
<style>
body {
  background-image: url("https://img.freepik.com/premium-photo/group-diverse-graduating-students_53876-141438.jpg");
  background-size:1600px 700px;  
}
</style>

<body>
<%
String context = request.getContextPath();
%>
<font color="green" size="20">${requestScope.success }</font>
<div>
 Click here to<a href="Institute_login.jsp">Login</a>
</div>
</body>
</html>