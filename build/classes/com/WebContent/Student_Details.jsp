<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.keane.training.domain.Student"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>



<html>
    <head>
    <title> Student Details    </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
   <script src="https://code.jquery.com/jquery-1.12.3.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

   <script>
$(document).ready(function(){
    $('#student').dataTable();
   
});
</script>

<style >
body{
 font-family: Verdana, Geneva, Tahoma, sans-serif;
}
</style>
</head>
<style>
body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/001/984/892/original/banner-design-geometric-hexagon-colorful-overlapping-with-background-free-vector.jpg");
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


		<div class="container" style="margin-top:100px">

		  <table id="student" class="table table-bordered table-hover">
		    <thead>
		    
		        <tr>
		        <th> Student_ID</th>
		        <th> Name </th>
		        <th> Qualification  </th>
		        <th> Contact_Number</th>
		        <th>Address </th>
		        <th>Email Id</th>
		        <th>User Id</th>
		        <th>Password</th>
		        
		     </tr>
		    </thead>
		<tbody>
		
		<%
		
		for(Student std: (ArrayList<Student>)request.getAttribute("stdlist"))  
		{
		%>
		
		<tr>
		<td><%=std.getStudent_Id() %></td>  
		 <td><%=std.getName() %> </td>  
		  <td><%=std.getQualification() %> </td> 
		  <td><%=std.getContact_Number() %> </td>
		  <td><%=std.getAddress() %> </td>
		  <td> <%=std.getEmail_Id() %></td>
		  <td>  <%=std.getUser_Id() %></td>
		  <td> <%=std.getPassword() %></td>
		</tr>
		
		<% } %>
		
		
		</tbody>
		</table>
		
		<div class="row">
		<div class="col-md-1">
		<form  action="Admin_Operations.jsp" method="post">

		<button  class="btn btn-success btn-block" type="submit">Back</button>
		</form>
		</div>
		
</div>
</body>
</html>
		
