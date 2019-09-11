   <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.virtusa.trainingmanagement.models.Admin_Scheduletraining" %>
    
<!DOCTYPE html>    
<html>
<head>
<title>Apply Training</title>
  <meta charset="utf-8">
  <link type="text/css" rel="stylesheet" href="../styles/empapplytraining.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="../scripts/empapplytraining.js"></script>
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
        <li><a href="/Trainingmanagement/views/emphome.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li class="active"><a href="#">Apply</a></li>
            <li><a href="/Trainingmanagement/views/empposttraining.jsp">Post</a></li>
          </ul>
        </li>
        <li><a href="/Trainingmanagement//views/empnotification.jsp">Notification</a></li>
        <li><a href="/Trainingmanagement//views/emphistory.jsp">History</a></li>
		<li><a href="/Trainingmanagement//views/empgivefeedback.jsp">feedback</a></li>
      </ul>  
    </div>
  </div>
</nav>


<table>

</table>
</body>
</html>