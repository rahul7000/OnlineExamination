<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/HeaderLogout.jsp"%>
<%@include file="/Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Examination System</title>
</head>
<link rel="stylesheet" href="css/StudentExam.css">

</head>

<body>


	<center>
		<%
			Login currentUser = (Login) (session.getAttribute("currentSessionUser"));
		%>Welcome!!
		<%=currentUser.getUserName()%>
	</center>

	<div class="flex-container">
		<nav class="nav">
		<ul>
			<li><a href="StudentController?action=listInstitute"><i>View
						Institutes</i></a></li>

		</ul>
		</nav>

		<article class="article">
		<table align="center">
			<tr>
				<th><u>Exam Instructions</u> </t>
			</tr>
			<tr>

				<td>1. The online exam is Objective type.<br> <br>
				</td>
			</tr>
			<tr>
				<td>2. There are five questions.<br> <br>
				</td>
			</tr>
			<tr>
				<td>3. Student has to answer all the questions.<br> <br>
				</td>
			</tr>
			<tr>
				<td>4. There are no negative marks.<br> <br>
				</td>
			</tr>
			<tr>
				<td>5. Correct answer carries 5 mark.<br> <br></td>
			</tr>
			<tr>
				<td>6. Wrong answer carries 0 mark. <br> <br></td>
			</tr>
			<tr>
				<td>7. Each student can take an exam only once.<br> <br>
				</td>
			</tr>
		</table>
		</article>

	</div>

</body>
</html>