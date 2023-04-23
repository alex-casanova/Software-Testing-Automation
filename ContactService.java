package main;
import java.util.*;
/**
 * 
 */
/**
 * @author acasanova
 *
 */

public class ContactService {
	//Create Contact List to check against
	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	//Adds specified Contact if it doesn't exist
	public boolean addContact(Contact c) {
		boolean exists = false;
		for(Contact i:contactList) {
			if(i.equals(c)) {
				exists = true;
				}
			}
		if (!exists) {
			contactList.add(c);
			return true;}
		else {return false;}
	}
	
	public Contact getContact(String ID) {
		Contact c = null;
		for(Contact i:contactList) {
			if(i.getID().equals(ID)){
				c = i;
			}
		}
			return c;
	}
	
	public Contact getContact(Contact c) 
	{
		return c;
	}
	
	
	//Deletes a contact if it exists
	public boolean deleteContact(String ID) {
		for(Contact i: contactList) {
			if(i.getID().equals(ID)){
				contactList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//Updates Contact
	public boolean updateContact(String ID, String firstName, String lastName, String phone, String address) {
		for(Contact i:contactList) {
			if(i.getID().equals(ID)) {
				if(!(firstName.equals("")) && !(firstName.length() > 10)) {
					i.setFirstName(firstName);
				}
				if(!(lastName.equals("")) && !(lastName.length() > 10)) {
					i.setLastName(lastName);
				}
				if(!(phone.equals("")) && (phone.length() == 10)) {
					i.setPhone(phone);
				}
				if(!(address.equals("")) && !(address.length() > 30)) {
					i.setAddress(address);
				}
				return true;
			} // End of if statement
		} //End of loop
		throw new IllegalArgumentException("This contact was not found!");
	} //End of UpdateContact
} //End of ContactService Class
