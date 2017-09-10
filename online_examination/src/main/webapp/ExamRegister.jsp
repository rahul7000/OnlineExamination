<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="HeaderLogout.jsp"%>
<%@include file="Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico"> 
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" href="css/StudentExam.css">
<title>Institute Exam Registration</title>
	<script type="text/javascript" src="ValidExam.js">

</script>

</head>

<body>

	<div style="font-size: 30px; color: blue" align="center">
		<%
			Login currentUser = (Login) (session.getAttribute("currentSessionUser"));
		%>

		Welcome
		<%=currentUser.getUserName()%>
	</div>
	<div class="flex-container">
		<nav class="nav">
		<ul>
			<li><a href="InstituteController?action=selectStudent"><i>View
						Students</i></a></li>
			<br>
			<br>
			<br>
			<br>
			<br>
			<li><a href="InstituteController?action=selectExam"><i>View
						Exams</i></a></li>
			<br>
			<br>
			<br>
			<br>
			<br>
			<li><a href="ExamRegister.jsp"><i>Upload
						Exam</i></a></li>
		</ul>
		</nav>

		<article class="article">
   
    <div class="container">
                <h1>Exam Registration Form</h1>
                
			   <section>				
                <div id="container_demo" >
                    <div id="wrapper">
                        <div id="ExamRegister">
                            <form name="signup" action="InstituteController?action=register" method="post" onsubmit="return validate()"> 
                                <h1>Exam Details</h1>
                            
                                 <p> 
                                    <label for="examname" class="examname" > Select Exam Subject </label>
                                    <input id="examname" name="examname" required="required" type="text" placeholder="java"/>
                                </p> 
                                <p> 
                                    <label for="date" class="date"  > Enter Date </label>
                                    <input id="examdate" name="examdate" required="required" type="date" placeholder="DD/MM/YYYY"/>
                                </p>
                             
                                <p> 
                                    <label for="time" class="time"  > Enter Time </label>
                                    <input id="examtime" name="examtime" required="required" type="time" placeholder="20:78"/>
                                </p>
                                <p> 
                                    <label for="marks" class="marks"> Enter Total Marks </label>
                                    <input id="exammarks" name="exammarks" required="required" type="text" placeholder="50"/> 
                                </p>
                                
                                <p> 
                                    <label for="instituteid" class="instituteid" >Institute ID is </label>
                                    <input id="instituteid" name="instituteid"   type="text" placeholder="024"/>
                                </p>
                               
                                  
                                 <p class="Signup button"> 
                                    <input type="submit" value="Register" /> 
								</p>
                           </form>
                        </div>

                       
                    </div>
                </div>  
            </section>
        </div>
        
  
  
  </article>


	</div>

</body>
</html>