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
<title>Request</title>
</head>
<style>
body {
  background-image: url("https://us.123rf.com/450wm/ihorsvetiukha/ihorsvetiukha1909/ihorsvetiukha190900170/ihorsvetiukha190900170.jpg?ver=6");
  background-size:1300px 700px;
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
    
    <div class="container " style="margin: 70px;">
        <div class="row">
        <div class="col-md-5"></div>
            <div class="col-md-3">
            <h2 style="padding-left:70px;"><b>Request</b></h2>
                <form  action="request.do" method="post">
                
                <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if>
                    
                    <div class="form-group" >
                      <label for="request" > Request Id</label>
                      <input type="text" class="form-control" id="request" name="request" placeholder="Response Id" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="message" > Message</label>
                      <input type="text" class="form-control" id="message" name="message" placeholder="Message" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="studentid" >Student ID</label>
                      <input type="text" class="form-control" id="studentid" name="studentid" placeholder="Student ID" required>
                    </div>
                    
                    <button type="submit" class="btn btn-success btn-block">Submit
                    </button>
                   </form>
                   </div>
        
            </div>
    </div>
</body>
</html>