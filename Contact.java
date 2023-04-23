package main;
/**
 * @author acasanova
 *
 */
public class Contact
{
	//Contact Variables
	String ID;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	//Contact Constructor
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
		}
	
	//Getters
	public String getID() {return ID;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getPhone() {return phone;}
	public String getAddress() {return address;}
	
	//Setters
	public void setID(String ID) {
		if( ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID - must be a value with 10 characters or fewer.");
			}
		if(this.ID != null) {
			throw new IllegalArgumentException("ID cannot be changed once set!");}
		else {this.ID = ID;}
		}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid entry - must be a value with 10 characters or fewer.");
			}
		else {
			this.firstName = firstName;}
		}
	
	public void setLastName(String lastName) {	
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid entry - must be a value with 10 characters or fewer.");
			}
		else {
			this.lastName = lastName;}
		}
	
	public void setPhone(String phone) {	
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid entry - must be a value with 10 digits.");
			}
		else {
			this.phone = phone;}
		}
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid entry - must be a value with 30 characters or fewer.");
			}
		else {
			this.address = address;	}
		}
} //End of Contact Class

