<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/HeaderLogout.jsp"%>
<%@include file="/Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Exam</title>
</head>
<link rel="stylesheet" href="css/StudentExam.css">

</head>

<body>
	<% Login currentUser = (Login)(session.getAttribute("currentSessionUser"));%>



	<form method="post" action="StudentController?action=getResult">


		<c:forEach items="${questionList}" var="question">

			<c:if test="${question.questionNo == 1}">
				<p>
					<c:out value="${question.questionNo}" />
				</p>


				<p>
					<c:out value="${question.question}" />
				</p>

				<input type="radio" name="answer1" value="optionA">
				<c:out value="${question.optionA}" />
				<input type="radio" name="answer1" value="optionB">
				<c:out value="${question.optionB}" />
				<input type="radio" name="answer1" value="optionC">
				<c:out value="${question.optionC}" />
				<input type="radio" name="answer1" value="optionD">
				<c:out value="${question.optionD}" />







			</c:if>

			<c:if test="${question.questionNo == 2}">
				<p>
					<c:out value="${question.questionNo}" />
				</p>


				<p>
					<c:out value="${question.question}" />
				</p>

				<input type="radio" name="answer2" value="optionA">
				<c:out value="${question.optionA}" />
				<input type="radio" name="answer2" value="optionB">
				<c:out value="$${question.optionB}" />
				<input type="radio" name="answer2" value="optionC">
				<c:out value="${question.optionC}" />
				<input type="radio" name="answer2" value="optionD">
				<c:out value="${question.optionD}" />






			</c:if>

			<c:if test="${question.questionNo == 3}">
				<p>
					<c:out value="${question.questionNo}" />
				</p>


				<p>
					<c:out value="${question.question}" />
				</p>

				<input type="radio" name="answer3" value="optionA">
				<c:out value="${question.optionA}" />
				<input type="radio" name="answer3" value="optionB">
				<c:out value="${question.optionB}" />
				<input type="radio" name="answer3" value="optionC">
				<c:out value="${question.optionC}" />
				<input type="radio" name="answer3" value="optionD">
				<c:out value="${question.optionD}" />






			</c:if>



			<c:if test="${question.questionNo == 4}">
				<p>
					<c:out value="${question.questionNo}" />
				</p>


				<p>
					<c:out value="${question.question}" />
				</p>

				<input type="radio" name="answer4" value="optionA">
				<c:out value="${question.optionA}" />
				<input type="radio" name="answer4" value="optionB">
				<c:out value="${question.optionB}" />
				<input type="radio" name="answer4" value="optionC">
				<c:out value="${question.optionC}" />
				<input type="radio" name="answer4" value="optionD">
				<c:out value="${question.optionD}" />






			</c:if>


			<c:if test="${question.questionNo == 5}">
				<p>
					<c:out value="${question.questionNo}" />
				</p>


				<p>
					<c:out value="${question.question}" />
				</p>

				<input type="radio" name="answer5" value="optionA">
				<c:out value="${question.optionA}" />
				<input type="radio" name="answer5" value="optionB">
				<c:out value="${question.optionB}" />
				<input type="radio" name="answer5" value="optionC">
				<c:out value="${question.optionC}" />
				<input type="radio" name="answer5" value="optionD">
				<c:out value="${question.optionD}" />


			</c:if>


		</c:forEach>

		<br> <br> <br> <input type="submit" value="Submit" />

	</form>


	<br>
	<br>



</body>
</html>