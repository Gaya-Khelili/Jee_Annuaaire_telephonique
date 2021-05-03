package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class DeleteGroupeContactValidationForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  	private String groupename=null;

			public String getGroupeName() {
				return groupename;
			}

			public void setGroupeName(String groupeName) {
				this.groupename =groupeName;
			}
			public void reset(ActionMapping mapping, HttpServletRequest request) {
			  	
			    this.groupename=null;
			   
		   }
			
			
			public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) 
			  {
				      ActionErrors errors = new ActionErrors();
				      
				      System.out.println("le GROUPE NAME EST :" + getGroupeName());
				      if( getGroupeName() == null || getGroupeName().length() < 1 ) {
				        errors.add("groupename", new ActionMessage("deletegroup.groupename.error.required"));
				      }
				      
				      return errors;
			 }
}
