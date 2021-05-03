<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
  
   <html:html>

   <head>

   <title><bean:message key="delete.groupe"/></title>

   <html:base/>

   </head>

   <body bgcolor="white">

   <html:form action="/DeleteGroupe">

   <html:errors/>

   <table>

        <h1>Bienvenue sur la page de suppression d'un groupe</h1>
		<h2>Veuillez indiquer le nom du groupe que vous voulez supprimer </h2>
		<div>
        	Nom du Groupe :
        	<input type="text" name="groupename">
    	</div>
          <td align="right">
            <html:submit>Supprimer le groupe</html:submit>
          </td>
    </tr>
  </table>
   </html:form>
   </body>
   </html:html>
