<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.keane.training.domain.Feedback"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>



<html>
    <head>
    <title> View Request   </title>
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
    $('#feedback').dataTable();
   
});
</script>
</head>
<style>
body {
  background-image: url("https://img.freepik.com/premium-vector/vector-illustration-quote-black-frame-with-quotation-marks-yellow-background_578506-105.jpg?w=2000");
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
		
		<table id="feedback" class="table table-responsive table-hover">
		    <thead>
		    
		        <tr>
		        <th> Feedback_ID</th>
		        <th> Feedback </th>
		        <th> Student_Id  </th>
		        
		        
		     </tr>
		    </thead>
		<tbody>
		
		<%
		
		for(Feedback f: (ArrayList<Feedback>)request.getAttribute("flist"))  
		{
		%>
		
		<tr>
		<td><%=f.getFeedback_Id() %></td>  
		 <td><%= f.getFeedback() %> </td>  
		  <td><%=f.getStudent_ID() %> </td> 
		</tr>
		
		<% } %>
		
		
		</tbody>
		</table>
		<div class="row">
		<div class="col-md-1">
		<form  action="Institute_Operations.jsp" method="post">

		<button  class="btn btn-success btn-block" type="submit">Back</button>
		</form>
		</div>
		
		</div>
		</div>
		
</body>
</html>
		
