<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UZBEK RC</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>

Welcome ${username}
<form action="FileUpload" method="post" enctype="multipart/form-data">
<input type="file" name="file" multiple>
<input type="submit" value="Upload">
</form>

<form action="Logout" method="get">
<input type="submit" value="Log Out">
</form>
</body>
</html>