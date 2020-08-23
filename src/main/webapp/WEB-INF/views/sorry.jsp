<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorry page</title>
</head>
<body>

<strong><c:out value="${msg}"></c:out>
<p> </p>
<c:out value="${msg2}"></c:out>
</strong>
<p> </p>
<p> </p>
<a href="/">Back to Home</a>
</body>
</html>