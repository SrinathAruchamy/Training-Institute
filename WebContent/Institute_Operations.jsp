<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Institute</title>

<style>
col-md-12{
height:50%;
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
                <li ><a  href="ins_logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
    
     <%HttpSession mysession=request.getSession(false);
			String app_user=(String)mysession.getAttribute("app_user");%>
			<div class="col-md-12" >
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
                        <img src="https://www.careermantra.net/blog/wp-content/uploads/2020/10/IMG-20201008-WA0051.jpg" alt="Los Angeles" style="width:100%;">
                      </div>
                
                      <div class="item">
                        <img src="https://mcet.in/wp-content/uploads/2015/07/DSC_0677-400x225.jpg" alt="Chicago" style="width:100%;">
                      </div>
                      <div class="item">
                        <img src="https://mcet.in/wp-content/uploads/MSD_LAB_MCT-500x300.jpg" alt="City" style="width:100%;">
                      </div>
                    </div>
                
                  </div>
            </div>
    
    
    <div class="container-fluid " style="margin: 70px;">
    
   
			
			
	</div>
    <div>
    <a href="studdetails.do">View Student</a>
    </div>
    
    <div>
    <a href="Upload_Article.jsp">Upload Article</a>
    </div>
    
    <div>
    <a href="faculty.do">Faculty Data </a>
    </div>
    
     <div>
    <a href="Update_Institute.jsp">Update Profile </a>
    </div>
    
    <div>
    <a href="Response.jsp">Response to Student </a>
    </div>
    
    <div>
    <a href="view_request.do">View Request </a>
    </div>
    
     <div>
    <a href="view_feedback.do">View Feedback</a>
    </div>
  </div>
    
</body>
</html>