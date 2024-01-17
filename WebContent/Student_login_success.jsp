<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Student</title>
</head>
<style>
body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/001/984/892/original/banner-design-geometric-hexagon-colorful-overlapping-with-background-free-vector.jpg");
  background-size:1400px 700px;
}

</style>
<style>
a {
  color: red;
}
</style>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand " style="color: whitesmoke;"><b>TRAINING INSTITUTE</b> </a>
            </div>
            <ul class="nav navbar-nav navbar-right" >
                <li ><a  href="logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
    
    
    <div class="container " style="margin: 120px;">
    
    <%
    String context = request.getContextPath();
	HttpSession mysession=request.getSession(false);
			String app_user=(String)mysession.getAttribute("userId");%>

    </div>
    
    <div class="container " style="margin: 70px;">
   
    <div>
    
   <a href="Update_Student.jsp">Update Profile </a>
    </div>
    
     <div>
   <a href="Request.jsp">Send Request </a>
    </div>
    
    <div>
    <a href="view_response.do">View Response </a>
    </div>
    
    <div>
    <a href="Student_Feedback.jsp">Send Feedback </a>
    
    </div>
  
</div>
  
</body>
</html>