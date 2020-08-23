<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Details page</title>
</head>
<body>

<h3>Details</h3>
<p>Name:<c:out value="${name}"></c:out></p>
<p>Year:<c:out value="${year}"></c:out></p>
<a href="/sorry?name=${name}&year=${year}">Submit</a>
</body>
</html>