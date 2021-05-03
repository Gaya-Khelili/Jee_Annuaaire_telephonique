<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html:html>
	<head>
		<title><bean:message key="title.error"/></title>
	</head>
	<body>
		<html:errors/>Erreur de création d'un contact<br/> 
		<h4><a href="main.do"><bean:message key="main.page.title"/></a></h4><br>	
	</body>
</html:html>
