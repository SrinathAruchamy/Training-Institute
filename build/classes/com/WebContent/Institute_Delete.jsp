<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Delete</title>
</head>
<style>
body {
  background-image: url("https://wallpaperaccess.com/full/7205205.jpg");
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
                <li ><a  href="admin_logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
   <div class="container " style="margin: 150px;">
        <div class="row">
        <div class="col-md-5"></div>
            <div class="col-md-3">
            <h2 style="padding-left:70px;"><b>  Delete </b></h2>
                <form  action="delete.do" method="post">
                
                 <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
				</c:if>
                    
                    <div class="form-group">
                      <label for="institute">Institute Id</label>
                      <input type="text" class="form-control" id="institute"  name="institute" placeholder="Institute Id" required>
                    </div>
                    
                    <button type="submit" class="btn btn-info btn-block btn-sm">Delete
                    </button>
                    <hr>
                 
        
                   </form>
                   </div>
            </div>
        </div>
   
</body>
</html>