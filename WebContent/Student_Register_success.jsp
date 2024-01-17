<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="com.keane.training.domain.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<style>


body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/001/984/892/original/banner-design-geometric-hexagon-colorful-overlapping-with-background-free-vector.jpg");
  background-size:1300px 700px;
}
</style>
<body>

<%
String context = request.getContextPath();
%>
<font color="green" size="20">${requestScope.success }</font>
<h4>Please note your password for further use
${requestScope.details.password }</h4>

<span>Click here to <a href="<%=context%>\Student_login.jsp"> login</a> </span>
</body>
</html>