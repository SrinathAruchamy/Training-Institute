<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Approval</title>
</head>
<body>

<%
String context = request.getContextPath();
%>
<font color="green" size="20">${requestScope.success }</font>
</body>
</html>