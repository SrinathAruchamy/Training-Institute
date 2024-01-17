<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.keane.training.domain.Faculty"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>



<html>
    <head>
    <title> Faculty Details    </title>
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
    $('#faculty').dataTable();
   
});
</script>
</head>
<style>
body {
  background-image: url("https://us.123rf.com/450wm/ihorsvetiukha/ihorsvetiukha1909/ihorsvetiukha190900170/ihorsvetiukha190900170.jpg?ver=6");
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

<div><h1>Faculty Data</h1></div>
		  <table id="faculty" class="table table-bordered table-hover">
		    <thead>
		    
		        <tr>
		        <th> Faculty_ID</th>
		        <th> Name </th>
		        <th> Institute_Id  </th>
		     </tr>
		    </thead>
		<tbody>
		
		<%
		
		for(Faculty f: (ArrayList<Faculty>)request.getAttribute("flist"))  
		{
		%>
		
		<tr>
		<td><%= f.getFaculty_Id() %></td>  
		 <td><%= f.getName() %> </td>  
		  <td><%= f.getInstitute_Id() %> </td>
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
		
