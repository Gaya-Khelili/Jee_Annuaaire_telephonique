package org.lip6.struts.ServletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.domain.DAOContact;

public class AddContactAction extends Action {

	
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		
		final AddContactValidationForm lForm=(AddContactValidationForm)pForm;
		
		final int id=0;
		final String firstName = lForm.getFirstName();
		final String lastName = lForm.getLastName();
		final String email = lForm.getEmail();
		final String street= lForm.getStreet();
		final String city= lForm.getCity();
		final String zip= lForm.getZip();
		final String country= lForm.getCountry();
		final String phonenumber= lForm.getPhonenumber();
		final String phonekind= lForm.getPhonekind();
		final String groupname= lForm.getGroupname();
		// create a new Contact
		final DAOContact lDAOContact = new DAOContact();
		final String lError = lDAOContact.addContact(id, firstName, lastName, email,street,city,zip,country,phonenumber,phonekind,groupname);
		

		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("successadd");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("erroradd");
		}
	}
}
