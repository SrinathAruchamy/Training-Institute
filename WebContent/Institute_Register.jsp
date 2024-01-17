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
<title>Institute</title>

<style>

body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}

.container{
padding-right:0px;
padding-left:90px

}
.reg{
jusity-content:center;
padding-left:80px;
}
#ins{
    border: 1px ridge slategrey;
  border-radius: 5px;
    height: 710px;
    padding-left:12px;
  box-shadow:2px 2px 8px #888888;

}
.col-md-6{
padding-left:20px
}
</style>
</head>
<style>
body {
  background-image: url("https://us.123rf.com/450wm/ihorsvetiukha/ihorsvetiukha1909/ihorsvetiukha190900170/ihorsvetiukha190900170.jpg?ver=6");
  background-size:1400px 700px;
}
</style>
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
    
    <div class="container " style="margin-top: 60px;">
        <div class="row">
         <div class="col-md-6">
         <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWMQwiwV_9WeOtkun3jOwsmhJjY7iuG1BzHUbYU2PlLpvjNDOr_1kZOEPVXWu7EkBmxSF8dBRG8oQ&usqp=CAU&ec=48665701" alt="Los Angeles" style="width:100%; height:720px; margin-top:20px">
        </div>
            <div class="col-md-4" id="ins">
            <h2 style="padding-left:70px;"><b>Registration</b></h2>
                <form  action="ins_register.do" method="post">
                 <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if>
		<font color="green" size="2">${requestScope.success }</font>
                    
                    <div class="form-group" >
                      <label for="instituteid" > Institute Id</label>
                      <input type="text" class="form-control" id="instituteid" name="instituteid" placeholder="Institute Id" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="institutename" > Institute Name</label>
                      <input type="text" class="form-control" id="institutename" name="institutename" placeholder="Institute Name" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="affiliationdate" > Affiliation Date </label>
                      <input type="date" class="form-control" id="affiliationdate" name="affiliationdate" placeholder="Affiliation Date" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="address" > Address</label>
                      <input type="text" class="form-control" id="address" name="address" placeholder="Address" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="course" > Number Of Course</label>
                      <input type="text" class="form-control" id="course" name="course" placeholder="Number Of Course" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="seats" > Number Of Seats</label>
                      <input type="text" class="form-control" id="seats" name="seats" placeholder="Number Of Seats" required>
                    </div>
                    
                    <div class="form-group">
                      <label for="password">Password</label>
                      <input type="password" class="form-control" id="password"  name="password" placeholder="Password" required>
                    </div>
                    
                    <button type="submit" class="btn btn-success btn-block">Register
                    </button>
                    <hr>
                    <div class="reg">
                     Click here to <a href="Institute_login.jsp"><b>Login</b></a>
                     </div>
                   </form>
                   </div>
        
            </div>
    </div>
        
</body>
</html>