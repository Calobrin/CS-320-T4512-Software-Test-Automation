//Andrew McPherson  -  SNHU CS-320  -  3/17/2022
package Contact;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts;
  
  	public ContactService() {
      // default constructor
      contacts = new ArrayList<>();
    }
  
  	Contact findById(String contactId) {
      // Return a contact with the specified ID if one exists, or null if there isn't one
      // with that ID already
      
      // loop over the contacts arraylist. For each contact, If it has the right ID, return it.
      // if we get to the end, return null
      for (int k=0; k < contacts.size(); k++) {
        if (contacts.get(k).getContactId().equals(contactId)) return contacts.get(k);
      }
      return null;
    }
  	int findIndexById(String contactId) {
        
        for (int k=0; k< contacts.size(); k++) {
          if (contacts.get(k).getContactId().equals(contactId)) return k;
        }
        return -1;
      }
  
  	public void addContact(String contactId, String firstName, String lastName, String phoneNum, String address) {
      if (findById(contactId) == null ) {
        // OK to add
        Contact c = new Contact( contactId,firstName,lastName,phoneNum,address );
        contacts.add(c);
      }
      // if already present, do nothing.
      
    }
	public void deleteContact(String contactId) {
	      if (findIndexById(contactId) >= 0)
			contacts.remove(findIndexById(contactId));
	    }
  	
  	public void updateFirstName(String contactId, String firstName) {
  	Contact c = findById(contactId);
  	if (c != null) c.setFirstName(firstName);
    }
  	public void updateLastName(String contactId, String lastName) {
  	Contact c = findById(contactId);
  	if (c != null) c.setLastName(lastName);
  	}
  	public void updatePhoneNumber(String contactId, String phoneNum) {
  	Contact c = findById(contactId);
  	if (c != null) c.setPhoneNum(phoneNum);
  	}
  	public void updateAddress(String contactId, String address) {
  	Contact c = findById(contactId);
  	if (c != null) c.setAddress(address);
  	}
}
