//Andrew McPherson  -  SNHU CS-320  -  3/17/2022
package Contact;

public class Contact {

	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	//Constructor of object
	//Initially designed to have default constructors and several additional constructors with each
	//new variable being included in the constructor, but I decided to create just one with all used variables
	Contact(String contactId, String firstName, String lastName, String phoneNum, String address){
		setContactId(contactId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setAddress(address);
	}
	//Setters
	public void setContactId(String contactId) {
		if(contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.contactId = contactId;
		
	}
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;	
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
		
	}
	public void setPhoneNum(String phoneNum) {
		String regex = "[0-9]+";
		if(phoneNum == null || phoneNum.length()!= 10 || !(phoneNum.matches(regex))) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.phoneNum = phoneNum;
	}
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
	//Getters
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	
}
