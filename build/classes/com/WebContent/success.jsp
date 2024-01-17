<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
  background-image: url("https://media.istockphoto.com/id/1165957815/photo/innovative-learning-creative-educational-study-concept-for-graduation-and-school-student.jpg?s=612x612&w=0&k=20&c=FB525wNCuqwHxYwec2YNfaUTZtgP88vlfHNKcFaNrUA=");
  background-size:1600px 700px;
}
</style>
<body>
<%
String context = request.getContextPath();
%>
<font color="green" size="20">${requestScope.success }</font>
</body>
</html>