<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
  
   <html:html>

   <head>

   <title><bean:message key="update.contact"/></title>

   <html:base/>

   </head>

   <body bgcolor="white">

   <html:form action="/UpdateContact">

   <html:errors/>

   <table>

        <h1>Bienvenue sur la page de mise à jour d'un contact</h1>
		<h2>Veuillez indiquer l'adresse mail du contact que vous voulez  mettre à jour </h2>
			<div>
	        	Email :
	        	<input type="email" name="email">
	    	</div>
    	<h2>Veuillez indiquer le nouveau prénom et le nouveau nom du contact</h2>
		    <div>
		        Prénom :
		        <input type="text" name="firstName">
		    </div>
		    <div>
		        Nom :
		        <input type="text" name="lastName">
		    </div>
          <td align="right">
            <html:submit>Mettre à jour le contact</html:submit>
          </td>
    </tr>
  </table>
   </html:form>
   </body>
   </html:html>
