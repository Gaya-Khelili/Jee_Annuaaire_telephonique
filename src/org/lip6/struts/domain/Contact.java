package org.lip6.struts.domain;

import java.util.ArrayList;

public class Contact {
	  private long id;   
	  private String firstName;
	  private String lastName;
	  private String email;
	  private ArrayList<ContactGroup> listContactgroup = new ArrayList<ContactGroup>() ;
	  private ArrayList<PhoneNumber> listPhoneNumber = new ArrayList<PhoneNumber>() ;
	  private Address address;
	  public Contact(int id, String firstName, String lastName, String email,ContactGroup contactgroup,PhoneNumber phoneNumber,
			  Address address) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.listContactgroup.add(contactgroup);
			this.listPhoneNumber.add(phoneNumber);
			this.setAddress(address);
		}
	  
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

	  /**
	   * @return ID Returns ID
	   */
	  public long getId() {
	    return id;
	  }

	  /**
	   * @param l Sets the ID
	   */
	  public void setId(long l) {
	    id = l;
	  }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	}

