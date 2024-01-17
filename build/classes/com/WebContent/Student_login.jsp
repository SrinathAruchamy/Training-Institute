<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Student</title>
<style>

body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}
.reg{
jusity-content:center;
padding-left:50px;
}
.container{
padding-right:70px;
}
.col-md-3{
    
    border: 1px ridge slategrey;
  border-radius: 5px;
    height: 350px;
    padding-left:12px;
  box-shadow:2px 2px 8px #888888;

}

</style>

</head>
<style>
body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/001/984/892/original/banner-design-geometric-hexagon-colorful-overlapping-with-background-free-vector.jpg");
  background-size:1600px 700px;
}
</style>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand " style="color: whitesmoke;"><b>TRAINING INSTITUTE</b> </a>
            </div>
            <ul class="nav navbar-nav navbar-right" >
            <li><a  href="index.jsp"> <i class="glyphicon glyphicon-home"></i>Home</a></li>
               <li ><a  href="Admin_login.jsp"><i class="glyphicon glyphicon-user"></i>  Admin</a></li>
                <li><a  href="Institute_login.jsp"> <i class="glyphicon glyphicon-education"></i>Institute</a></li>
                <li><a  href="Student_login.jsp"> <i class="glyphicon glyphicon-user"></i>Student</a></li>
            </ul>
        </div>
    </nav> 
    <div class="container " style="margin-top: 200px;">
        <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-5">
         <img src="https://1.bp.blogspot.com/-tZAxyyiM9UA/YS1EQp6vWMI/AAAAAAAAKow/Gat3MbczyTgXxbsD2ajjYDe1T_IRwHD5gCLcBGAsYHQ/w640-h427/Learn_English_with_pictures.jpg" alt="Los Angeles" style="width:100%; height:350px;">
        </div>
            <div class="col-md-3">
            <h2 style="padding-left:60px;"><b>Login</b></h2>
                <form  action="login.do">
                    
                    <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if>
                   <div class="form-group" >
                      <label for="studentid" >Student ID</label>
                      <input type="text" class="form-control" id="studentid" name="studentid" placeholder="User ID" >
                    </div>
                    <div class="form-group">
                      <label for="password">Password</label>
                      <input type="password" class="form-control" id="password"  name="password" placeholder="Password" >
                    </div>
                    
                    <button type="submit" class="btn btn-info btn-block btn-sm">Login
                    </button>
                    <hr>
                   <div class="reg">
                     Click here to <a href="Student_Register.jsp"><b>Register</b></a>
                     </div>
                   </form>
                   </div>
            </div>
        </div>
        
    
</body>
</html>