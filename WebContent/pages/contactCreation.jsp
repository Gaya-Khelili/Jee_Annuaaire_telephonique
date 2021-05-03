<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
  
   <html:html>

   <head>

   <title><bean:message key="add.contact"/></title>

   <html:base/>

   </head>

   <body bgcolor="white">

   <html:form action="/AddContact">

   <html:errors/>

   <table>

        <tr>

          <td align="center" colspan="2">
		<font size="4">Please Enter the Following Details</font>
 	</tr>
		<tr>
          <td align="right">
            First Name
          </td>
          <td align="left">
            <html:text property="firstName" size="30" maxlength="30"/>
          </td>
        </tr>
        <tr>
          <td align="right">
            Last Name
          </td>
          <td align="left">
            <html:text property="lastName" size="30" maxlength="30"/>
          </td>
        </tr>

        <tr>
          <td align="right">
            E-mail address
          </td>
          <td align="left">
            <html:text property="email" size="30" maxlength="30"/>
          </td>
           <tr>
          <td align="right">
            Street
          </td>
          <td align="left">
            <html:text property="street" size="30" maxlength="30"/>
          </td>
        </tr>
           <tr>
          <td align="right">
            City
          </td>
          <td align="left">
            <html:text property="city" size="30" maxlength="30"/>
          </td>
        </tr>
           <tr>
          <td align="right">
            Zip
          </td>
          <td align="left">
            <html:text property="zip" size="30" maxlength="30"/>
          </td>
        </tr>
           <tr>
          <td align="right">
            Country
          </td>
          <td align="left">
            <html:text property="country" size="30" maxlength="30"/>
          </td>
        </tr> 
         <tr>
          <td align="right">
            Group Name
          </td>
          <td align="left">
            <html:text property="groupname" size="30" maxlength="30"/>
          </td>
        </tr>
        
         <tr>
          <td align="right">
            Phone number
            
          </td>
          
          <td align="left">
            <html:text property="phonenumber" size="30" maxlength="30"/>
          </td>
        </tr>
        </tr>
        <tr>
          <td align="right">
            Phone kind 
          </td>
          <td align="left">
          	 <select name="phonekind">
        	<option>Téléphone portable</option>
        	<option>Téléphone professionnel</option>
        	<option>Téléphone fix</option>
        	</select>
          </td>
        </tr>
	<tr>
          <td align="right">
            <html:submit>Save</html:submit>
          </td>
    </tr>
  </table>
   </html:form>
   </body>
   </html:html>
