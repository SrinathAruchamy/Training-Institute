<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.keane.training.domain.Response"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>



<html>
    <head>
    <title> View Response   </title>
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
    $('#response').dataTable();
   
});
</script>
</head>
<style>
body {
  background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20201024/pngtree-abstract-scene-layout-in-pastel-colors-yellow-question-mark-3d-rendering-image_436004.jpg");
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


		<div class="container" style="margin-top:60px">
		
		<table id="response" class="table table-responsive table-hover">
		    <thead>
		    
		        <tr>
		        <th> Response_ID</th>
		        <th> Message </th>
		        <th> Student_Id  </th>
		        <th>Institute_Id</th>
		        
		     </tr>
		    </thead>
		<tbody>
		
		<%
		
		for(Response r: (ArrayList<Response>)request.getAttribute("rlist"))  
		{
		%>
		
		<tr>
		<td><%=r.getResponse_Id() %></td>  
		 <td><%= r.getMessage() %> </td>  
		  <td><%=r.getStudent_Id() %> </td> 
		  <td> <%=r.getInstitute_Id() %> </td>
		</tr>
		
		<% } %>
		
		
		</tbody>
		</table>
		<div class="row">
		<div class="col-md-1">
		<form  action="Student_login_success.jsp" method="post">

		<button  class="btn btn-success btn-block" type="submit">Back</button>
		</form>
		</div>
		
		</div>
		</div>
		
</body>
</html>
		
