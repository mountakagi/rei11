<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.util.ArrayList" %>


<% String [] seminar={"Dtrutsセミナー","JSPセミナー","Javaセミナー"};
pageContext.setAttribute("seminar",seminar);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>page1.jsp</title>
</head>
<body>
<form action="../Page1to2Controller" method="POST">
注文したい品名と発注表<br/>
<table border="1">


<c:forEach var="seminaritem" items="${seminar}" >
	<tr>


		<td>
			<input type="hidden" name="seminar" value="${seminaritem}" />
			<c:out value="${seminaritem}"/>
		</td>
		<td>

		<select name="ninzu">
		<c:forEach var="i" begin="0" end="100" step="1" >

		<option value="${i}"><c:out value="${i}"/></option>
			</c:forEach>
		</select>


		</td>
	</tr>
		</c:forEach>


</table>


		<input type ="submit" value="決定">


</form>
</body>
</html>