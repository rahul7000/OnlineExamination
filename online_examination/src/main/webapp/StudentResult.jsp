<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.blahblah.model.Login"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/ThankYou.css">
 <%@include file="HeaderLogout.jsp" %>
 <%@include file="Footer.html" %>
 <title>Result</title>
</head>
<body>


<div class=mydiv>
<p><font color="green">
<h2><center>Thank You for taking Exam!!!!</center></h2>
<h2><center>Please visit again to take another exam</center></h2></font>

</p>
<table style="margin-bottom: 300px; cellspacing: 10px">
		
		<tbody>
			
					<td style="width: 5000px"><c:out value="${result}" /></td>
		</tbody>
	</table>
</body>
</html>