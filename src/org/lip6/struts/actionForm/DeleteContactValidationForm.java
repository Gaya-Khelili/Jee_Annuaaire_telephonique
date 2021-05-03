package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class DeleteContactValidationForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  	private String email=null;

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
			public void reset(ActionMapping mapping, HttpServletRequest request) {
			  	
			    this.email=null;
			   
		   }
			public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) 
			  {
				      ActionErrors errors = new ActionErrors();
				      
				      
				      if( getEmail() == null || getEmail().length() < 1 ) {
				        errors.add("email", new ActionMessage("creation.email.error.required"));
				      }
				      
				      return errors;
			 }
}
