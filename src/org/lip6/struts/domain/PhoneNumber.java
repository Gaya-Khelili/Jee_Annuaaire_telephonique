package org.lip6.struts.domain;

public class PhoneNumber {
	private int id;
	private String phoneKind;
	private String phoneNumber;
    private Contact contact;
	public PhoneNumber(int id, String phoneKind, String phoneNumber,Contact contact) {
		this.id = id;
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
		this.setContact(contact);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneKind() {
		return phoneKind;
	}
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((phoneKind == null) ? 0 : phoneKind.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (id != other.id)
			return false;
		if (phoneKind == null) {
			if (other.phoneKind != null)
				return false;
		} else if (!phoneKind.equals(other.phoneKind))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
