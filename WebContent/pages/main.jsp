<%@ page language="java" contentType="text/html charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<html:html>
	<head>
		<title><bean:message key="main.page.title"/></title>
	</head>
	<body>
		<h1><bean:message key="main.page.menu"/></h1>
		<h4><a href="ContactCreation.do"><bean:message key="main.addcontact.link"/></a></h4><br>		
		<h4><a href="ContactDelete.do"><bean:message key="main.deletecontact.link"/></a></h4><br>
		<h4><a href="ContactSearch.do"><bean:message key="main.searchcontact.link"/></a></h4><br>
		<h4><a href="ContactUpdate.do"><bean:message key="main.updatecontact.link"/></a></h4><br>
		<h4><a href="GroupeDelete.do"><bean:message key="main.deletegroupe.link"/></a></h4><br>
	</body>
</html:html>