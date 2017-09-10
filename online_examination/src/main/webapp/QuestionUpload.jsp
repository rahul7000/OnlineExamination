<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="HeaderLogout.jsp"%>
<%@include file="Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Examination System</title>

</head>
<link rel="stylesheet" href="css/StudentExam.css">
<script type="text/javascript" src="ValidQuestion.js">

</script>

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
			<li><a href="ExamRegister.jsp"><i>Upload Exam</i></a></li>
		</ul>
		</nav>

		<article class="article">
		<h1>Submit only 5 questions</h1>
		<div>
			<form name="qstn" action="InstituteController?action=question" method="post" onsubmit="return validate()">
				<br> <br> <label for="qno">Enter Question Number</label> <input
					type="text" id="qno" name="qno" placeholder="1."> <br>
				<br> <label for="Qname">Enter Question<br> <br></label>

				<textarea rows="4" cols="50" id="Qname" name="Qname"
					placeholder="What is.....?"></textarea>
				<br> <br> <label for="opt1">Enter Option 1</label> <input
					type="text" id="opt1" name="optA" placeholder="A."> <br>
				<br> <label for="opt2">Enter Option 2</label> <input
					type="text" id="opt2" name="optB" placeholder="B."> <br>
				<br> <label for="opt3">Enter Option 3</label> <input
					type="text" id="opt1" name="optC" placeholder="C."> <br>
				<br> <label for="opt4">Enter Option 4</label> <input
					type="text" id="opt4" name="optD" placeholder="D."> <br>
				<br> <label for="correct">Correct Answer</label> <input
					type="text" id="correct" name="correct" placeholder="correct.">
				<br> <br> <label for="examid">Enter Exam ID</label> <input
					type="text" id="examid" name="examid" placeholder="EX1"> <br>
				<br> <input type="submit" value="Submit">

			</form>
		</div>
		</article>


	</div>

</body>
</html>