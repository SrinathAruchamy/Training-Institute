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
body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/001/984/892/original/banner-design-geometric-hexagon-colorful-overlapping-with-background-free-vector.jpg");
  background-size:1400px 600px;
  
}
</style>
<style>
.container{
padding-right:0px;
padding-left:90px

}
body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}
.col-md-6{
padding-left:20px
}
#ins{
	border: 1px ridge slategrey;
  border-radius: 5px;
    height: 670px;
    padding-left:12px;
  box-shadow:2px 2px 8px #888888;

}
</style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="#" class="navbar-brand " style="color: whitesmoke;"><b>TRAINING INSTITUTE</b> </a>
            </div>
            <ul class="nav navbar-nav navbar-right" >
                <li ><a  href="Admin_login.jsp"><i class="glyphicon glyphicon-user"></i>  Admin</a></li>
                <li><a  href="Institute_login.jsp"> <i class="glyphicon glyphicon-education"></i>Institute</a></li>
                <li><a  href="Student_login.jsp"> <i class="glyphicon glyphicon-user"></i>Student</a></li>
            </ul>
        </div>
    </nav> 
    
    <div class="container " style="margin-top: 80px;">
        <div class="row">
        <div class="col-md-6">
         <img src="img8.jpg" alt="Los Angeles" style="width:100%; height:680px;">
        </div>
            <div class="col-md-4" id="ins">
            <h2 style="padding-left:70px;"><b><h1>Registration</h1></b></h2>
                <form  action="register.do" method="post">
                
               <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if>
                
                    <div class="form-group" >
                      <label for="studentid" >Student ID</label>
                      <input type="text" class="form-control" id="studentid" name="studentid" placeholder="Student ID" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="name" >Name</label>
                      <input type="text" class="form-control" id="name" name="name" placeholder="Name" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="qualification" >Qualification</label>
                      <input type="text" class="form-control" id="qualification" name="qualification" placeholder="Qualification" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="contact" >Contact Number</label>
                      <input type="text" class="form-control" id="contact" name="contact" placeholder="Contact Number" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="address" >Address</label>
                      <input type="text" class="form-control" id="address" name="address" placeholder="Address" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="email" >Email Id</label>
                      <input type="text" class="form-control" id="email" name="email" placeholder="Email Id" required>
                    </div>
                    
                    
                    <div class="form-group">
                      <label for="userid">User Id</label>
                      <input type="text" class="form-control" id="userid"  name="userid" placeholder="User Id" required>
                    </div>
                    
                   
                    <button type="submit" class="btn btn-success btn-block ">Register

                    </button>
                    </form>
            </div>
        </div>
        
    </div>

</body>
</html>