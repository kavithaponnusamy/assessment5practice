<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Display Sorry Message(View Name)</h3>
<c:out value="${msg}"></c:out>
<p></p>
<c:out value="${msg2}"></c:out>

<a href="/carrer-selection">Select a Carrer</a>
</body>
</html>