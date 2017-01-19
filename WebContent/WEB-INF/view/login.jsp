<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="login" method="POST">
		User Name:<input type="text" name="name" />
		Password:<input type="password" name="password" />
		<input type="submit" value="Login" /><br />
		<p style="color: red;">${error}</p>
		<p>${test}</p>
	</form>
	</div>
</body>
</html>