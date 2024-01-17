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
<title>Institute Updation</title>
</head>

<style>
body {
  background-image: url("https://www.shutterstock.com/image-vector/background-groups-students-front-college-260nw-1962550804.jpg");
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
                <li ><a  href="ins_logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
 
 <div class="container " style="margin: 150px;">
        <div class="row">
        <div class="col-md-5"></div>
            <div class="col-md-3">
            <h2 style="padding-left:0px;"><b>Update Profile</b></h2>
                <form  action="update.do" method="post">
                
                <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if>
                    <div class="form-group">
                      <label for="institute">Institute Id</label>
                      <input type="text" class="form-control" id="institute"  name="institute" placeholder="Institute Id" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="course" > Number_of_Course</label>
                      <input type="text" class="form-control" id="course" name="course" placeholder="Number of Course" required>
                    </div>
                    
                    
                    <button type="submit" class="btn btn-success btn-block btn-sm">Submit
                    </button>
                    <hr>
                 
        
                   </form>
                   </div>
            </div>
        </div>
</body>
</html>