package org.lip6.struts.ServletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.DeleteGroupeContactValidationForm;
import org.lip6.struts.domain.DAOGroupeContact;

public class DeleteGroupeContactAction extends Action{
	
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
	    final HttpServletResponse pResponse) {
		
		final DeleteGroupeContactValidationForm lForm=(DeleteGroupeContactValidationForm)pForm;
	
		final String groupeName = lForm.getGroupeName();
		System.out.println("COUCOU "+groupeName);
		
		// create a new Contact
		final DAOGroupeContact lDAOGroupeContact = new DAOGroupeContact();
		final String lError = lDAOGroupeContact.deleteGroup(groupeName);
		
		
		
		if(lError == null) {
			// if no exception is raised,  forward "success"
			return pMapping.findForward("successdeletegroupe");
		}
		else {
			// If any exception, return the "error" forward
			return pMapping.findForward("errordeletegroupe");
		}
	}

}
