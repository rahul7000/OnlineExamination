<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="HeaderLogout.jsp"%>
<%@include file="Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institute</title>

</head>
<link rel="stylesheet" href="css/StudentExam.css">

</head>

<body>

	<p style="font-size: 30px; color: blue" align="center">
		<%
			Login currentUser = (Login) (session.getAttribute("currentSessionUser"));
		%>

		Welcome
		<%=currentUser.getUserName()%>
	</p>
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
		
		 </article>

	</div>

</body>
</html>