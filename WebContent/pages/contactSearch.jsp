<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
  
   <html:html>

   <head>

   <title><bean:message key="delete.contact"/></title>

   <html:base/>

   </head>

   <body bgcolor="white">

   <html:form action="/SearchContact">

   <html:errors/>

   <table>

        <h1>Bienvenue sur la page de recherche d'un contact</h1>
		<h2>Veuillez indiquer l'adresse mail du contact que vous voulez rechercher</h2>
		<div>
        	Email :
        	<input type="email" name="email">
    	</div>
          <td align="right">
            <html:submit>Rechercher le contact</html:submit>
          </td>
    </tr>
  </table>
   </html:form>
   </body>
   </html:html>
