package org.lip6.struts.ServletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.UpdateContactValidationForm;
import org.lip6.struts.domain.DAOContact;

public class UpdateContactAction extends Action{
	
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		
		final UpdateContactValidationForm lForm=(UpdateContactValidationForm)pForm;
		
		
		final String firstName = lForm.getFirstName();
		final String lastName = lForm.getLastName();
		final String email = lForm.getEmail();
		
		// create a new Contact
		final DAOContact lDAOContact = new DAOContact();
		final String lError = lDAOContact.updateContact(email, firstName, lastName );
		
		
		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("successupdate");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("errorupdate");
		}
	}

}
