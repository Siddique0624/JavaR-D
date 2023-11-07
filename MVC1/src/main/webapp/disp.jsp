<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)session.getAttribute("NAME");
String usn=(String)session.getAttribute("USN");
int marks1=(int)session.getAttribute("MARKS1");
int marks2=(int)session.getAttribute("MARKS2");
int marks3=(int)session.getAttribute("MARKS3");
out.println(name+" "+usn+" "+marks1+" "+marks2+" "+marks3);

%>
</body>
</html>