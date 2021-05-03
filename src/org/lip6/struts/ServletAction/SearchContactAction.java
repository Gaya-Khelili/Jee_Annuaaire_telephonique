package org.lip6.struts.ServletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.SearchContactValidationForm;
import org.lip6.struts.domain.Address;
import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.ContactGroup;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.domain.PhoneNumber;



public class SearchContactAction extends Action{
	
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {
		
		final SearchContactValidationForm lForm=(SearchContactValidationForm)pForm;

		final String email = lForm.getEmail();
	
		// create a new Contact
		final DAOContact lDAOContact = new DAOContact();
		
		Contact contact = new Contact(0,null,null,null,null,null,null);
		Address address = new Address(0,null,null,null,null);
		ContactGroup contactgroup = new ContactGroup(0,null,null);
		PhoneNumber phonenumber = new PhoneNumber(0,null,null,null);
		
		final String lError = lDAOContact.searchContact(email,contact,address,contactgroup,phonenumber);
		
		/* Remplissage pour le contact */
		pRequest.getSession().setAttribute("Email", contact.getEmail());	
		pRequest.getSession().setAttribute("FirstName", contact.getFirstName());		
		pRequest.getSession().setAttribute("LastName", contact.getLastName());

		/*Remplissage pour l'adresse */
		pRequest.getSession().setAttribute("Street", address.getStreet());
		pRequest.getSession().setAttribute("City", address.getCity());
		pRequest.getSession().setAttribute("Zip", address.getZip());
		pRequest.getSession().setAttribute("Country", address.getCountry());

		/*Remplissage pour le numéro de téléphone */
		pRequest.getSession().setAttribute("PhoneKind", phonenumber.getPhoneKind());
		pRequest.getSession().setAttribute("PhoneNumber", phonenumber.getPhoneNumber());

		/*Remplissage du groupe */
		pRequest.getSession().setAttribute("GroupName", contactgroup.getGroupName());
		
		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("successsearch");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("errorsearch");
		}
	}

}
