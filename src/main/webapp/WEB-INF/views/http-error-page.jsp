<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTTP ERROR PAGE!</title>
</head>
<body>
	<h1>Sorry for the inconvenience.</h1>
	<h2>Description: ${message}</h2>
	<a href="${path}/user/contact">Complain about this issue to us.</a>
</body>
</html>