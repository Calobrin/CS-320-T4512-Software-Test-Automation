package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
		assertTrue(service.findById("123456789").getContactId().equals("123456789"));
		assertTrue(service.findById("123456789").getFirstName().equals("Andrew"));
		assertTrue(service.findById("123456789").getLastName().equals("McPherson"));
		assertTrue(service.findById("123456789").getPhoneNum().equals("1231231231"));
		assertTrue(service.findById("123456789").getAddress().equals("123 address"));
	}
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("16892", "Andrew", "McPherson", "1231231231", "123 address");
		service.deleteContact("16892");
      	assertTrue(service.findById("16892") == null);
	}
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
      	service.updateFirstName("123456789", "Sanchez");
      	assertTrue(service.findById("123456789").getFirstName().equals("Sanchez"));
		
	}
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
      	service.updateLastName("123456789", "Sanchez");
      	assertTrue(service.findById("123456789").getLastName().equals("Sanchez"));
	}
	@Test
	void testUpdatePhoneNum() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
      	service.updatePhoneNumber("123456789", "1221122122");
      	assertTrue(service.findById("123456789").getPhoneNum().equals("1221122122"));
	}
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Andrew", "McPherson", "1231231231", "123 address");
      	service.updateAddress("123456789", "123 Sanchez");
      	assertTrue(service.findById("123456789").getAddress().equals("123 Sanchez"));
	}
}