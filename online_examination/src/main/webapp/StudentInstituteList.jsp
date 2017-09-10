<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/HeaderLogout.jsp"%>
<%@include file="/Footer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Institute List</title>
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
				<th style="width: 50px">Institute ID</th>
				<th style="width: 70px">Institute Name</th>
				<th style="width: 100px">Institute Email</th>
				<th style="width: 60px">Institute Phone</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${instituteList}" var="institute">
				<tr>

					<td style="width: 100px"><c:out value="${institute.instituteId}" /></td>
					<td style="width: 100px"><c:out value="${institute.instituteName}" /></td>
					<td style="width: 150px"><c:out value="${institute.emailId}" /></td>
					<td style="width: 150px"><c:out value="${institute.contactNumber}" /></td>
					

					<td style="width: 100px"><a href="StudentController?action=selectInstitute&instituteId=<c:out value="${institute.instituteId}"/>">Give Exam</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>