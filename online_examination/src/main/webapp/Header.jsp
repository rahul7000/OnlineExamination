<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/header.css">
 <link rel="stylesheet" href="css/homes.css">
</head>
<body>
<div class="flex-container"  style="text-align: center;">
	
	<header>
  	<h1>Online Examination System</h1>
	</header>
	
</div>
<nav>
<ul>

<li><a href="Home.jsp">Home</a></li>
<li><a href="About.jsp">About Us</a> </li>
<li><a href="Contact.jsp">Contact</a></li>
<li style="float:right"><a href="Login.jsp">Login</a></li>
<li class="dropdown" style="float:right">
    <a href="#" class="dropbtn">Signup</a>
    
    <div class="dropdown-content">
      <a href="StudentSignup.jsp">StudentSignup</a>
      <a href="InstituteSignup.jsp">institute Signup</a>
    </div>  
</li>

</ul>
</nav>

</body>
</html>