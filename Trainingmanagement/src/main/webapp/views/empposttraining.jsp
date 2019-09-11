<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Post Training</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>


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
        <li><a href="../views/emphome.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
<<<<<<< HEAD
            <li><a href="/Trainingmanagement/EmpApplytraining">Apply</a></li>
=======
            <li><a href="/Trainingmanagement/EmpApplytrainingServlet">Apply</a></li>
>>>>>>> branch 'master' of https://github.com/rakshi98/kaviproject.git
            <li class="active"><a href="#">Post</a></li>
          </ul>
        </li>
        <li><a href="../views/empnotification.jsp">Notification</a></li>
        <li><a href="../views/emphistory.jsp">History</a></li>
		<li><a href="../views/empgivefeedback.jsp">feedback</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="col-sm-6 col-sm-offset-3">

<div class="panel panel-info">
<div class="panel-heading">Enter training details</div>
<div class="panel-body">

<form action="EmpPosttrainingServlet" method="post">

<div class="form-group row">
<label class="col-md-4 col-form-label text-md-right">Full Name</label>
<div class="col-md-6">
<input type="text" id="fullName" class="form-control" name="fullName">
</div>
</div>

<div class="form-group row">
<label class="col-md-4 col-form-label text-md-right">E-Mail Address</label>
<div class="col-md-6">
<input type="text" id="emailAddress" class="form-control" name="emailAddress">
</div>
</div>

<div class="form-group row">
<label class="col-md-4 col-form-label text-md-right">Employee ID</label>
<div class="col-md-6">
<input type="text" id="employeeId" class="form-control" name="employeeId">
</div>
</div>

<div class="form-group row">
<label class="col-md-4 col-form-label text-md-right">Phone Number</label>
<div class="col-md-6">
<input type="number" id="phoneNumber" class="form-control" name="phoneNumber">
</div>
</div>

<div class="form-group row">
<label class="col-md-4 col-form-label text-md-right">Training Name</label>
<div class="col-md-6">
<input type="text" id="trainingName" class="form-control" name="trainingName">
</div>
</div>

<div class="panel-footer">
<div class="col-md-6 offset-md-4">
<button type="submit" class="btn btn-primary">Apply</button>
<button type="button" class="btn btn-danger">Cancel</button>
</div>
</div>
</form>
</div>
</div>
</div>

</body>
</html>