<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title> MCET Institute and Management</title>


<style>

body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}
h1,p{
  font-family: Verdana, Geneva, Tahoma, sans-serif;
}
.p{
padding-top:45px;
}

.sticky-footer{
			background-color: slategrey;			
			height:80px;
			margin-top:150px;
			position:sticky;
			jusity-content:center;
            color: black;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            
        }
</style>

</head>
<style>
body {
  background-image: url("https://mcet.in/ITstream/NCCC18/mcet_tran.png");
  background-size:1600px 700px;
}
</style>
<body>

<%
String context = request.getContextPath(); 
%>
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
    
    
    <div class="container" style="margin-top: 400px;"> 
        <div class="row">
            <div class="col-md-6">
            
            <h2>MCET INSTITUTE</h2>
            <p>PLACE TO LEARN NOT TO STUDY ENGINEERING</p>
            <div class="row">
            <div class="col-md-3">
            
            </div>
            </div>
             </div>
            <div class="col-md-6" >
                <div id="myCarousel" class="carousel slide " data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                      <li data-target="#myCarousel" data-slide-to="1"></li>
                      <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                
                    <!-- Wrapper for slides -->
                    <div class="carousel-inner">
                      <div class="item active">
                          </div>
                
                      <div class="item">
                        </div>
                      <div class="item">
                        </div>
                    </div>
                
                  </div>
            </div>
           
        </div>
    </div>
     </div>
    <footer class="sticky-footer">
    <div class="container text-center" style="color: black;">
      <p class="p" > @ Copyright MCET Training Institute & corp ltd..;CONTACT US @ Ph.no: 1421 424553 0765;email: mcet@gmail.com</p>
    </div>
   </body>
</html>