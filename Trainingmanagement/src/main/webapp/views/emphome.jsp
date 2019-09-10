<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
<link href="../empprofile.css" rel="stylesheet">
</head>

<body>
<%
HttpSession session1=request.getSession(false);  
String employeeId=(String)session1.getAttribute("employeeId");
String employeeuserName=(String)session1.getAttribute("employeeuserName");
String employeeEmailid=(String)session1.getAttribute("employeeEmailid");
Integer employeePhone=(Integer)session1.getAttribute("employeePhone"); 
String employeeDesignation=(String)session1.getAttribute("employeeDesignation"); 
%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <!-- <a href="#" data-toggle="modal" class="profile-edit-btn">Virtusa</a> -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/Trainingmanagement/EmpApplytrainingServlet">Apply</a></li>
            <li><a href="../views/empposttraining.jsp">Post</a></li>
          </ul>
        </li>
        <li><a href="../views/empnotification.jsp">Notification</a></li>
        <li><a href="../views/emphistory.jsp">History</a></li>
		<li><a href="../views/empgivefeedback.jsp">feedback</a></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="container emp-profile">
<div class="row">

<!--box for profile pic-->
<div class="col-md-3">
<div class="profile-img">
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS52y5aInsxSm31CvHOFHWujqUx_wWTS9iM6s7BAm21oEN_RiGoog" alt=""/>

<div>
Change Photo
<input type="file" name="file"/>
</div>
</div>
</div>


<!--for name and designation -->
<div class="col-md-6">
<div class="profile-head">
<h4>Virtusa</h4>
<h5><% %></h5>
<h6><%=employeeDesignation%></h6>


<ul class="nav nav-tabs" id="myTab" role="tablist">
<li class="nav-item">
<a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
</li>
</ul>
</div>
</div>

<!-- editing profile button -->
<div class="col-md-2">
<a href="#edit" data-toggle="modal" class="profile-edit-btn">EDIT PROFILE</a>
</div>


<!-- user details -->
<div class="row">
<div class="col-md-8">
<div class="tab-content profile-tab" id="myTabContent">
<div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">

<br>
<br>
<div class="row">
<div class="col-md-6">
<label>Employee Id</label>
</div>
<div class="col-md-6">
<p id="eid"><%=employeeId%></p>
</div>
</div>

<div class="row">
<div class="col-md-6">
<label>Username</label>
</div>
<div class="col-md-6">
<p id="uname"><%=employeeuserName %> </p>
</div>
</div>

<div class="row">
<div class="col-md-6">
<label>Name</label>
</div>
<div class="col-md-6">
<p id="uf1name"><%%></p>
</div>
</div>

<div class="row">
<div class="col-md-6">
<label>Email</label>
</div>
<div class="col-md-6">
<p id="uemail"><%=employeeEmailid%></p>
</div>
</div>

<div class="row">
<div class="col-md-6">
<label>Phone</label>
</div>
<div class="col-md-6">
<p id="uphone"><%=employeePhone%></p>
</div>
</div>
                                        
<div class="row">
<div class="col-md-6">
<label>Profession</label>
</div>
<div class="col-md-6">
<p><%=employeeDesignation%></p>
</div>
</div>

</div>                     
</div>
</div>
</div>
</div>

</div>


<div class="modal fade" id="edit" role="dialog">
<div class="modal-dialog modal-lg">
<div class="modal-content">

<div class="model-header">
<div class="edit_modal1">
<h4>Enter Your Details!</h4>
</div>
</div>

<div class="modal-body">
<form action="EmpProfileServlet" method="post">

<div class="edit_modal">

<label><B>Employee-ID</B></label>  &nbsp; &nbsp; &nbsp; &nbsp;
<input type="text" id="employeeId" placeholder="Enter EID" name="employeeId" required><br>

<label><B>Username</B></label> &nbsp; &nbsp; &nbsp; &nbsp;
<input type="text" id="userName" placeholder="Enter username" name="userName" required><br>

<label><B>Email-Id</B></label> &nbsp; &nbsp; &nbsp; &nbsp;
<input type="text" id="emailId" placeholder="Enter email" name="emailId" required><br>

<label><B>Phone</B></label> &nbsp; &nbsp; &nbsp; &nbsp;
<input type="number" id="phoneNumber" placeholder="Enter Contact Number" name="phoneNumber" required><br>

<label><B>Designation</B></label> &nbsp; &nbsp; &nbsp; &nbsp;
<input type="text" id="designation" placeholder="Enter Designation" name="designation" required><br>

<div class="modal-footer">
<input type="submit" class="btn btn-primary" value="Submit">
<a class="btn btn-default" data-dismiss="modal">Close</a>
</div>

</div>
</form>
</div>

</div>
</div>
</div>
</body>
</html>