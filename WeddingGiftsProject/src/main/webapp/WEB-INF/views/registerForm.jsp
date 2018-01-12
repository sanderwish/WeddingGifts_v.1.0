<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method = "post" modelAttribute="user">
		<form:input path="userName" placeholder="Nazwa użytkownika"/>
		<form:errors path="userName"/> <br>
		<form:password path="password" placeholder="Hasło" />
		<form:errors path="password"/> <br>
		<form:input path="email" placeholder="E-mail"/>
		<form:errors path="email"/><br>
		<input type="submit" value="zatwierdź">
	</form:form>
</body>
</html>