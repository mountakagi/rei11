<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>page3.jsp</title>
</head>
<body>

確定しました！<br/>
<table border="1">

	<tr>
		<td>
			セミナー名
		</td>
		<td>
			人数
		</td>
	</tr>
<c:forEach var="orderlistitem" items="${orderlist}" >
	<tr>
		<td>
			<c:out value="${orderlistitem.seminar}"/>
		</td>




		<td>
		<c:out value="${orderlistitem.orderninzu}"/>
		</td>
	</tr>
	</c:forEach>


</table>





</body>
</html>