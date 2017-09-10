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
<title>Institute Student List</title>
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
				<th style="width: 100px">Student ID</th>
				<th style="width: 100px">Student Name</th>
				<th style="width: 100px">Student DOB</th>
				<th style="width: 100px">Student Gender</th>
				<th style="width: 100px">Student Email</th>
				<th style="width: 100px">Student Phone</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${studentList}" var="student">
				<tr>

					<td style="width: 100px"><c:out value="${student.studentId}" /></td>
					<td style="width: 100px"><c:out value="${student.studentName}" /></td>
					<td style="width: 100px"><c:out value="${student.dateOfBirth}" /></td>
					<td style="width: 100px"><c:out value="${student.gender}" /></td>
					<td style="width: 100px"><c:out value="${student.emailId}" /></td>
					<td style="width: 100px"><c:out
							value="${student.contactNumber}" /></td>



				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>