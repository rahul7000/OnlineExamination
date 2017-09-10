<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="HeaderLogout.jsp"%>
<%@include file="Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institute Exam List</title>
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

	<table style="margin-bottom: 300px; cellspacing: 10px">
		<thead>
			<tr>
				<th style="width: 50px">Exam ID</th>
				<th style="width: 70px">Exam Name</th>
				<th style="width: 100px">Date</th>
				<th style="width: 60px">Time</th>
				<th style="width: 60px">Marks</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${examList}" var="exam">
				<tr>
					<td style="width: 50px"><c:out value="${exam.examId}" /></td>
					<td style="width: 70px"><c:out value="${exam.examName}" /></td>
					<td style="width: 100px"><c:out value="${exam.date}" /></td>
					<td style="width: 60px"><c:out value="${exam.time}" /></td>
					<td style="width: 60px"><c:out value="${exam.marks}" /></td>

					
					<td style="width: 70px"><a
						href="InstituteController?action=deleteExam&examId=<c:out value="${exam.examId }"/>">Delete</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>