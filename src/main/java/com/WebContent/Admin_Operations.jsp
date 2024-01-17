<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Admin</title>

<style>

.row{
padding-left:2px;
}

#a{
width:24%;
    border: 10px ridge slategrey;
  border-radius: 5px;
    height: 200px;
  box-shadow:2px 2px 8px #888888;

}
#b{
width:24%;
    border: 10px ridge slategrey;
  border-radius: 5px;
    height: 200px;
  box-shadow:2px 2px 8px #888888;
margin-left:10px;
}
#c{
width:24%;
    border: 10px ridge slategrey;
  border-radius: 5px;
    height: 200px;
  box-shadow:2px 2px 8px #888888;
margin-left:10px;
}
#d{
width:24%;
    border: 10px ridge slategrey;
  border-radius: 5px;
    height: 200px;
  box-shadow:2px 2px 8px #888888;
margin-left:10px;
}
body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}

.sticky-footer{
			background-color: slategrey;			
			height:100px;
			margin-top:50px;
			position:sticky;
			jusity-content:center;
            color: black;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            
        }
mark { 
  background-color: grey;
  color: black;
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
                <li ><a  href="admin_logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 
    
    <div class="container">
     <%HttpSession mysession=request.getSession(false);
			String app_user=(String)mysession.getAttribute("app_user");%>
			
			<div>
        <img src="https://icon-library.com/images/admin-login-icon/admin-login-icon-26.jpg" alt="Los Angeles" style="width:100%; height:500px;">
    </div>
    
    <div class="container" style="margin-top:20px;">
    <div class="row" >    
		<div class="col-sm-3" id="a">
		<h><mark>INSTITUTION APPROVAL</mark></h>
		 <form action="approve_ins.do" method="post">
		 
		  <c:if test="${requestScope.Error!=null}">
			<font color="red">${requestScope.Err}</font>
				</c:if>
                    <font color="green" size="3">${requestScope.Done }</font>
                    <div class="form-group" >
                      <input type="text" class="form-control" id="approve" name="approve" placeholder="Status" required>
                    </div>
                    <div class="form-group">
                      <input type="text" class="form-control" id="institute"  name="institute" placeholder="Institute Id" required>
                    </div>
		 
		 <button type="submit" class="btn btn-success btn-block">Approve</button>
		 </form>
		</div>
		
		<div class="col-sm-3" id="b">
		 <h><mark>DELETE INSTITUTION</mark></h>
		  <form action="delete.do" method="post">
		  <c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
				</c:if>
				<font color="green" size="3">${requestScope.success }</font>
              <div class="form-group">
               <input type="text" class="form-control" id="institute"  name="institute" placeholder="Institute Id" required>
            </div>
		 <button type="submit" class="btn btn-success btn-block">Delete</button>
		 </form>
		</div>
		
		<div class="col-sm-3" id="c">
		<h><mark>VIEW STUDENT</mark></h>
		 <form action="studdetails.do" method="post">
		 <button type="submit" class="btn btn-success btn-block">View Student</button>
		 </form>
		</div>
		
		<div class="col-sm-3" id="d">
		<h><mark>VIEW COMPLAINT</mark></h>
		 <form action="complaint.do" method="post">
		 <button type="submit" class="btn btn-success btn-block">View Complaint</button>
		 </form>
		</div>
	</div>
    </div>
    </div>
    
    <footer class="sticky-footer">
    <div class="container text-center" style="color: whitesmoke;">
      <p class="p" style="padding-top:40px;"> @ Copyright Training Institute 2023</p>
    </div>
  </footer>
	
</body>
</html>