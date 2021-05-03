package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
public class AddContactValidationForm extends ActionForm {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	  private String firstName=null;
	  private String lastName=null;
	  private String email=null;
	  private String street=null;
	  private String city=null;
	  private String zip=null;
	  private String country=null;
	  private String groupname=null;
	  private String phonenumber=null;
	  private String phonekind=null;
	  
	 
	  
	/**
	   * @return Email
	   */
	  public String getEmail() {
	    return email;
	  }

	  /**
	   * @return First Name
	   */
	  public String getFirstName() {
	    return firstName;
	  }

	  /** 
	   * @return Last name
	   */
	  public String getLastName() {
	    return lastName;
	  }

	  /**
	   * @param string Sets the Email
	   */
	  public void setEmail(String string) {
	    email = string;
	  }

	  /**
	   * @param string Sets the First Name
	   */
	  public void setFirstName(String string) {
	    firstName = string;
	  }

	  /**
	   * @param string sets the Last Name
	   */
	  public void setLastName(String string) {
	    lastName = string;
	  }

	


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPhonekind() {
		return phonekind;
	}

	public void setPhonekind(String phonekind) {
		this.phonekind = phonekind;
	}
	  public void reset(ActionMapping mapping, HttpServletRequest request) {
		  	
		    this.firstName=null;
		    this.lastName=null;
		    this.email=null;
		    this.street=null;
		    this.city=null;
		    this.zip=null;
		    this.country=null;
		    this.groupname=null;
		    this.phonenumber=null;
		    this.phonekind=null;
		    
	  }
	  public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) 
	  {
		      ActionErrors errors = new ActionErrors();
		      
		      if( getFirstName()== null || getFirstName().length() < 1 ) {
		        errors.add("first name",new ActionMessage("creation.fn.error.required"));
		      }
		      if( getLastName()== null || getLastName().length() < 1 ) {
		        errors.add("last name",new ActionMessage("creation.ln.error.required"));
		      }
		      if( getEmail() == null || getEmail().length() < 1 ) {
		        errors.add("email", new ActionMessage("creation.email.error.required"));
		      }
		      if( getStreet() == null || getStreet().length() < 1 ) {
			        errors.add("street", new ActionMessage("creation.email.error.required"));
			      }
		      if( getCity() == null || getCity().length() < 1 ) {
			        errors.add("city", new ActionMessage("creation.email.error.required"));
			      }
		      if( getZip() == null || getZip().length() < 1 ) {
			        errors.add("zip", new ActionMessage("creation.email.error.required"));
			      }
		      if( getCountry() == null || getCountry().length() < 1 ) {
			        errors.add("country", new ActionMessage("creation.email.error.required"));
			      }
		      if( this.getGroupname() == null || getGroupname().length() < 1 ) {
			        errors.add("groupname", new ActionMessage("creation.email.error.required"));
			      }
		      if( this.getPhonenumber() == null || getPhonenumber().length() < 1 ) {
			        errors.add("phonenumber", new ActionMessage("creation.email.error.required"));
			      }
		      if( this.getPhonekind() == null || getPhonekind().length() < 1 ) {
			        errors.add("phonekind", new ActionMessage("creation.email.error.required"));
			      }
		      return errors;
	 }

}
