<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name View</title>
</head>
<body>
Date : <b>${date} </b><br/>
Hello, <b>${name} </b > <br/>


<c:forEach items="${names}" var="temp">
    <p>${temp}</p><br/>
</c:forEach>

</body>
</html>