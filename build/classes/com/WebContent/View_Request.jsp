<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.keane.training.domain.Request"%>
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
    $('#request').dataTable();
   
});
</script>
</head>
<style>
body {
  background-image: url("https://media.istockphoto.com/id/1277853731/photo/concept-of-answering-questions-on-the-network.jpg?s=612x612&w=0&k=20&c=s_13XfysuyQi3rvjS28PzqQ6pITsY5ygy5r8SjSbcEI=");
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
                <li ><a  href="ins_logout.do"><i class="glyphicon glyphicon-user"></i>  Logout</a></li>
            </ul>
        </div>
    </nav> 


		<div class="container" style="margin-top:60px">
		
		<table id="request" class="table table-responsive table-hover">
		    <thead>
		    
		        <tr>
		        <th> Request_ID</th>
		        <th> Message </th>
		        <th> Student_Id  </th>
		        
		        
		     </tr>
		    </thead>
		<tbody>
		
		<%
		
		for(Request r: (ArrayList<Request>)request.getAttribute("rlist"))  
		{
		%>
		
		<tr>
		<td><%=r.getRequest_Id() %></td>  
		 <td><%= r.getMessage() %> </td>  
		  <td><%=r.getStudent_Id() %> </td> 
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
		
