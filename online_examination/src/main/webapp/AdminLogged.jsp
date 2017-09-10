<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="HeaderLogout.jsp"%>
<%@include file="Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>

</head>
<link rel="stylesheet" href="StudentExam.css">

</head>

<body>
	<p style="font-size: 30px; color: blue" align="center">
		<% Login currentUser = (Login)(session.getAttribute("currentSessionUser"));%>

		Welcome
		<%= currentUser.getUserName()%>
	</p>




	<p
		style="font-size: 15px; padding: 20px; width: 20%; background-color: white; color: black; padding-left: 90px">
		<a href="AdminController?action=selectStud"> View Students </a>
	</p>

	<table style="margin-bottom: 50px; cellspacing: 10px">

		<tbody>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td style="width: 100px"><c:out value="${student.studentId}" /></td>
					<td style="width: 150px"><c:out value="${student.studentName}" /></td>
					<td style="width: 150px"><c:out
							value="${student.contactNumber}" /></td>

					<td style="width: 180px"><c:out value="${student.emailId}" /></td>
					<td style="width: 170px"><c:out value="${student.instituteId}" /></td>
					<td style="width: 180px"><c:out value="${student.gender}" /></td>
					<td style="width: 170px"><c:out value="${student.dateOfBirth}" /></td>
					<td style="width: 170px"><c:out value="${student.password}" /></td>
					

					<td style="width: 100px"><a
						href="AdminController?action=deleteStud&studentId=<c:out value="${student.studentId }"/>">Delete</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p
		style="font-size: 15px; padding: 20px; width: 20%; background-color: white; color: black; align: center; padding-left: 90px">
		<a href="AdminController?action=selectInst"> View Institutes </a>
	</p>

	<table style="margin-bottom: 100px; cellspacing: 10px">

		<tbody>
			<c:forEach items="${institutes}" var="institute">
				<tr>
					<td style="width: 100px"><c:out
							value="${institute.instituteId}" /></td>
					<td style="width: 100px"><c:out
							value="${institute.instituteName}" /></td>
					<td style="width: 150px"><c:out
							value="${institute.contactNumber}" /></td>

					<td style="width: 150px"><c:out value="${institute.emailId}" /></td>
					<td style="width: 100px"><c:out value="${institute.password}" /></td>

					<td style="width: 100px"><a
						href="AdminController?action=deleteInst&instituteId=<c:out value="${institute.instituteId }"/>">Delete</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>