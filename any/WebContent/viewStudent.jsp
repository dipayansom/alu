<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Id : <c:out value="${stud.id }"></c:out><br/>
Student Name: <c:out value="${stud.name }"></c:out><br/>
Student Gender: <c:out value="${stud.gender }"></c:out><br/>
Student course: <c:out value="${stud.course }"></c:out><br/>
Student Address: <c:out value="${stud.address }"></c:out><br/>
<a href="/any/StudentController">Go Back </a><br/>
</body>
</html>