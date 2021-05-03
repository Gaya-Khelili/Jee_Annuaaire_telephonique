package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UpdateContactValidationForm extends ActionForm {
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		  private String email=null;
		  private String firstName=null;
		  private String lastName=null;

	
			public void reset(ActionMapping mapping, HttpServletRequest request) {
			  	
			    this.email=null;
			    this.firstName=null;
			    this.lastName=null;
			   
		   }
			public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) 
			  {
				      ActionErrors errors = new ActionErrors();
				      
				      if( getEmail() == null || getEmail().length() < 1 ) {
				        errors.add("email", new ActionMessage("creation.email.error.required"));
				      }
				      if( getFirstName()== null || getFirstName().length() < 1 ) {
					        errors.add("first name",new ActionMessage("creation.fn.error.required"));
					      }
					  if( getLastName()== null || getLastName().length() < 1 ) {
					        errors.add("last name",new ActionMessage("creation.ln.error.required"));
					    }
				      
				      return errors;
			 }

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			
			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
}
