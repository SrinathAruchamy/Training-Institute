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
<title>Article</title>
</head>

<style>
body {
  background-image: url("https://c0.wallpaperflare.com/preview/71/610/431/advice-article-background-beverage.jpg");
  background-size:1600px 700px;
  }
  h1 {
            color:Red;
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
    
    <div class="container " style="margin: 90px;">
        <div class="row">
        <div class="col-md-5"></div>
            <div class="col-md-3">
            <h2 style="padding-left:70px;"><b><h1>Article</h1></b></h2>
                <form  action="article.do" method="post">
                
                 <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
				</c:if>
                    
                    <div class="form-group" >
                      <label for="articleid" > Article Id</label>
                      <input type="text" class="form-control" id="articleid" name="articleid" placeholder="Article Id" required>
                    </div>
                    
                   <div class="form-group" >
                      <label for="instituteid" > Institute Id</label>
                      <input type="text" class="form-control" id="instituteid" name="instituteid" placeholder="Institute Id" required>
                    </div>
                    
                    <div>
                      <input type="file" id="file" name="file" placeholder=" Article" required>
                    </div>
                    <hr>
                    <div>
                    <button type="submit" class="btn btn-success btn-block">Submit
                    </button>
                    </div>
                    
                   </form>
                   </div>
        
            </div>
    </div></body>
</html>