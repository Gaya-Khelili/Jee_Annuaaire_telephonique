<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html:html>
	<head>
	
		<title><bean:message key="success"/></title>
	</head>
	<body>
	 
		<h1><bean:message key="contact.search"/></h1>
		
		<br><h2><bean:message key="contact.search.contact"/></h2>
		<br>Email : <td data-title=<bean:message key="search.contact.email"/>>${Email}</td>
		<br>Prénom : <td data-title=<bean:message key="search.contact.firstname"/>>${FirstName}</td>
		<br>Nom : <td data-title=<bean:message key="search.contact.lastname"/>>${LastName}</td>
		
		<br><h2><bean:message key="contact.search.address"/></h2>
		<br>Adresse : <td data-title=<bean:message key="search.address.street"/>>${Street}</td>
		<br>Ville : <td data-title=<bean:message key="search.address.city"/>>${City}</td>
		<br>Code Postal : <td data-title=<bean:message key="search.address.zip"/>>${Zip}</td>
		<br>Pays : <td data-title=<bean:message key="search.address.country"/>>${Country}</td>
		
		<br><h2><bean:message key="contact.search.phone"/></h2>
		<br>Type de téléphone : <td data-title=<bean:message key="search.phone.kind"/>>${PhoneKind}</td>
		<br>Numéro de téléphone : <td data-title=<bean:message key="search.phone.number"/>>${PhoneNumber}</td>
		
		<br><h2><bean:message key="contact.search.group"/></h2>
		<br>Groupe :<td data-title=<bean:message key="search.group.name"/>>${GroupName}</td>
		
		<h4><a href="main.do"><bean:message key="main.page.title"/></a></h4><br>	
	</body>
</html:html>