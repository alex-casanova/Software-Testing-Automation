package main;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

class ContactTest {
	public static ContactService cs = new ContactService();

	@Test
	public void test_newContact() {
		
		//Tests the creation of new Contact
		Contact c = new Contact("1234567890", "John", "Smith", 
						"1234567890", "123 John Smith St");
		cs.addContact(c);
		assertEquals(cs.getContact(c).getID(), "1234567890");
		assertEquals(cs.getContact(c).getFirstName(), "John");
		assertEquals(cs.getContact(c).getLastName(), "Smith");
		assertEquals(cs.getContact(c).getPhone(), "1234567890");
		assertEquals(cs.getContact(c).getAddress(), "123 John Smith St");
		assert(cs.getContact(c).getAddress().length() < 30);
	}
	
	@Test
	public void test_updateContact() {
		
		//Tests the updating of new services
		Contact c = new Contact("1234567890", "John", "Smith", 
						"1234567890", "123 John Smith St");
		assertEquals(c.getID(), "1234567890");
		assertEquals(c.getFirstName(), "John");
		assertEquals(c.getLastName(), "Smith");
		assertEquals(c.getPhone(), "1234567890");
		assertEquals(c.getAddress(), "123 John Smith St");
		assert(c.getAddress().length() < 30);
		
		cs.addContact(c);
		cs.updateContact("1234567890", "", "", "", "");
		assertEquals(c.getID(), "1234567890");
		assertEquals(c.getFirstName(), "John");
		assertEquals(c.getLastName(), "Smith");
		assertEquals(c.getPhone(), "1234567890");
		assertEquals(c.getAddress(), "123 John Smith St");
	}
	
	@Test
	public void test_contactLengthRequirements() {
		//Tests that the invalid inputs provided throw IllegalArgumentException
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Contact c = new Contact("24562834756239845629837456", "Johnjohnjohnjohnjohn", "Smithsmithsmithsmithsmith", "123123123123123123123123123123", "123123123123123123123123123123123123123123123");
			});
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	public static void main(String[] args) 
	{
		ContactTest test = new ContactTest();
		test.test_newContact();
		test.test_updateContact();
		test.test_contactLengthRequirements();
	}
}

