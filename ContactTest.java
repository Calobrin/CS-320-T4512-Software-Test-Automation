
package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
		assertTrue(contact.getContactId().equals("123456789"));
		assertTrue(contact.getFirstName().equals("Andrew"));
		assertTrue(contact.getLastName().equals("McPherson"));
		assertTrue(contact.getPhoneNum().equals("1231231231"));
		assertTrue(contact.getAddress().equals("123 address"));
	}
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("123412341234", "Andrew", "McPherson", "1231231231", "123 address");
		}); 
	}
	@Test 
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("0123456789", "Andrew is too long", "McPherson", "1231231231", "123 address");
		}); 
	}
	@Test 
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("0123456789", "Andrew", "McPherson is too long", "1231231231", "123 address");
		}); 
	}
	@Test
	void testPhoneNumNot10Digits() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertFalse(contact.getPhoneNum().length() != 10); 		
	}
	@Test 
	void testAddressTooLong() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "");
		assertFalse(contact.getAddress().length() > 30);
	}
	
	@Test
	void testIdNotNull() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertNotNull(contact.getContactId());
	}
	@Test
	void testFirstNameNotNull() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertNotNull(contact.getFirstName());
	}
	@Test
	void testLastNameNotNull() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertNotNull(contact.getLastName());
	}
	@Test
	void testPhoneNumNotNull() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertNotNull(contact.getPhoneNum());
	}
	@Test
	void testAddressNotNull() {
		Contact contact = new Contact("123456789", "Andrew", "McPherson", "1231231230", "123 address");
		assertNotNull(contact.getAddress());
	}
}
