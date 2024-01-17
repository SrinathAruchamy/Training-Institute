<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Student Updation</title>
</head>
<style>
body {
  background-image: url("https://cdn5.vectorstock.com/i/1000x1000/58/54/set-of-students-with-books-on-world-map-background-vector-19705854.jpg");
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
                <li ><a  href="logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
 
 <div class="container " style="margin: 150px;">
        <div class="row">
        <div class="col-md-5"></div>
            <div class="col-md-3">
            <h2 style="padding-left:0px;"><b>Update Profile</b></h2>
                <form  action="student_update.do" method="post">
                     <div class="form-group" >
                      <label for="studentid" >Student ID</label>
                      <input type="text" class="form-control" id="studentid" name="studentid" placeholder="Student ID" required>
                    </div>
                    
                    <div class="form-group" >
                      <label for="contact" >Contact Number</label>
                      <input type="text" class="form-control" id="contact" name="contact" placeholder="Contact Number" required>
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