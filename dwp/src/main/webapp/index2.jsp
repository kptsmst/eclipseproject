<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	A JSP File, with a form!
	<form action="loginServlet" method="post">
    Username: <input type="text" name="yourName" size="20">
    Password: <input type="text" name="yourPassword" size="20">
    <input type="submit" value="Call Servlet" />
</form>
</body>
</html>