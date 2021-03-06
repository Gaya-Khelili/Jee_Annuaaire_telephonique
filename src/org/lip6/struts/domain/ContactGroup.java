package org.lip6.struts.domain;

import java.util.ArrayList;

public class ContactGroup {
	private int groupId;
	private String groupName;
	private ArrayList<Contact> listContact = new ArrayList<Contact>();
	public ContactGroup(int groupId, String groupName,Contact contact) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.listContact.add(contact);
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupId;
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
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
		ContactGroup other = (ContactGroup) obj;
		if (groupId != other.groupId)
			return false;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		return true;
	}
	
	
}
