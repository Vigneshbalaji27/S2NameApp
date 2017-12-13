<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WelcomePage</title>
</head>
<body>
<h1><s:text name="welcomeview.header"/></h1>
	<s:form action="welcome">
<s:text name="welcomeview.uname"/>:<s:textfield name="uname"/><br/>
<s:text name="welcomeview.age"/>:<s:textfield name="age"/><br/>
	<s:submit/>
	
	</s:form>
</body>
</html>